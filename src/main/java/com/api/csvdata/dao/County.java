package com.api.csvdata.dao;

public class County {
    private String year;
    private String month;
    private String day;
    private String countyfips;
    private String gps_retail_and_recreation;
    private String gps_grocery_and_pharmacy;
    private String gps_parks;
    private String gps_transit_stations;
    private String gps_workplaces;
    private String gps_residential;
    private String gps_away_from_home;

    public County(String year, String month, String day, String countyfips, String gps_retail_and_recreation, String gps_grocery_and_pharmacy, String gps_parks, String gps_transit_stations, String gps_workplaces, String gps_residential, String gps_away_from_home) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.countyfips = countyfips;
        this.gps_retail_and_recreation = gps_retail_and_recreation;
        this.gps_grocery_and_pharmacy = gps_grocery_and_pharmacy;
        this.gps_parks = gps_parks;
        this.gps_transit_stations = gps_transit_stations;
        this.gps_workplaces = gps_workplaces;
        this.gps_residential = gps_residential;
        this.gps_away_from_home = gps_away_from_home;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getCountyfips() {
        return countyfips;
    }

    public void setCountyfips(String countyfips) {
        this.countyfips = countyfips;
    }

    public String getGps_retail_and_recreation() {
        return gps_retail_and_recreation;
    }

    public void setGps_retail_and_recreation(String gps_retail_and_recreation) {
        this.gps_retail_and_recreation = gps_retail_and_recreation;
    }

    public String getGps_grocery_and_pharmacy() {
        return gps_grocery_and_pharmacy;
    }

    public void setGps_grocery_and_pharmacy(String gps_grocery_and_pharmacy) {
        this.gps_grocery_and_pharmacy = gps_grocery_and_pharmacy;
    }

    public String getGps_parks() {
        return gps_parks;
    }

    public void setGps_parks(String gps_parks) {
        this.gps_parks = gps_parks;
    }

    public String getGps_transit_stations() {
        return gps_transit_stations;
    }

    public void setGps_transit_stations(String gps_transit_stations) {
        this.gps_transit_stations = gps_transit_stations;
    }

    public String getGps_workplaces() {
        return gps_workplaces;
    }

    public void setGps_workplaces(String gps_workplaces) {
        this.gps_workplaces = gps_workplaces;
    }

    public String getGps_residential() {
        return gps_residential;
    }

    public void setGps_residential(String gps_residential) {
        this.gps_residential = gps_residential;
    }

    public String getGps_away_from_home() {
        return gps_away_from_home;
    }

    public void setGps_away_from_home(String gps_away_from_home) {
        this.gps_away_from_home = gps_away_from_home;
    }


}
