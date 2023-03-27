package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     *
     * @param city Adding this city
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        else {
            cities.add(city);
        }

    }


    /**
     *  Assignment Part Starts
     */

    /**
     *
     * @param city Delete the city if exist
     */
    public void Delete(City city) {
        if(!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        else {
            cities.remove(city);
        }

    }

    /**
     *
     * @return Returns the number of cities
     */
    public int Count() {
        return cities.size();
    }

    /**
     *
     * @param flag if flag=1, sorting will be according to Cities name
     *             if flag=2, sorting will be according to Provinces name
     * @return Will return the Sorted List
     */
    public List<City> getSort(int flag) {
        List<City> cityList = cities;
        if(flag==1) {
            Collections.sort(cityList, new CitySort());
        }
        else if(flag==2) {
            Collections.sort(cityList, new ProvinceSort());
        }
        return cityList;
    }
}
