package com.api.csvdata.controller;

import com.api.csvdata.dao.County;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.min;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class PageWiseDataController {

    @Value("${CSVFile.path}")
    private String path;

    @Value("${CSVFile.name}")
    private String fileName;


    @RequestMapping(method= RequestMethod.GET,value="/getCSVData")
    public List<County> getCSVData(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "100") int pageSize) throws Exception{

        List<County> inputList = new ArrayList<County>();
        String InputFilePath;
        if(path != null && fileName != null){
            InputFilePath = path.concat(fileName);
            System.out.println("InputFilePath >> "+InputFilePath);
        }else{
            throw new Exception("File path not configured");
        }

        try{
            File f = new File(InputFilePath);
            InputStream inputS = new FileInputStream(f);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputS));

            inputList = bufferedReader.lines().skip(1).map(s->preBindCSVData(s)
            ).collect(Collectors.toList());

        }catch(FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println(ex);
        }

        Map<Integer,List<County>> test=getPartition(inputList,pageSize);

        List<County> testList = test.get(page);

        return testList;
    }

    public Map<Integer,List<County>> getPartition(List list,int pageSize){
        return IntStream.range(0, (list.size() + pageSize - 1) / pageSize)
                .boxed()
                .collect(Collectors.toMap(i -> i ,
                        i -> list.subList(i * pageSize, min(pageSize * (i + 1), list.size()))));

    }

    private County preBindCSVData(String s) {

        String[] county = s.split(",");
        County obj = new County( county[0],county[1],county[2],county[3],county[4],county[5],
                                county[6],county[7],county[8],county[9],county[10]);
         return obj;

    }
}