# PageWiseCSVData

1.Configure the file path and file name in application.properties files
2.Server port configured to 8082
3.Access to the API URL as below
  1. default page 0 : http://localhost:8082/api/getCSVData
  2. Change parameter value for page in the url (default value set to 0 for page and 100 for pageSize)
         >> http://localhost:8082/api/getCSVData?page=2
         >>http://localhost:8082/api/getCSVData?page=3&pageSize=50
  
