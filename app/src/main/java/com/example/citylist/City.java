package com.example.citylist;

import java.util.Comparator;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}

/**
 * Sort City name wise
 */
class CitySort implements Comparator<City> {
    @Override
    public int compare(City city1, City city2) {
        return city1.getCityName().compareTo(city2.getCityName());
    }
}

/**
 * Sort Province name wise
 */
class ProvinceSort implements Comparator<City> {
    @Override
    public int compare(City city1, City city2) {
        return city1.getProvinceName().compareTo(city2.getProvinceName());
    }
}