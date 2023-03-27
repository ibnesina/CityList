package com.example.citylist;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class CityListTest {
    /**
     * Checking Cities are adding or not
     */
    @Test
    public void testAdd() {
        CityList cityList = new CityList();
        City city = new City("Dhaka", "Farmgate");
        cityList.add(city);
        assertEquals(1, cityList.getSort(1).size());
        assertTrue(cityList.getSort(1).contains(city));

        City city1 = new City("Khulna", "Jessore");
        cityList.add(city1);
        assertEquals(2, cityList.getSort(1).size());
        assertTrue(cityList.getSort(1).contains(city));
    }


    /**
     * Checks if the city is already added or not
     */
    @Test
    public void testAddException() {
        CityList cityList = new CityList();
        City city = new City("Dhaka", "Farmgate");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }


    /**
     * Checks the ordering of the cities
     */
    @Test
    public void testGetCities() {
        CityList cityList = new CityList();

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        City city1 = new City("Dhaka", "Farmgate");
        cityList.add(city1);

        assertEquals(0, city.compareTo(cityList.getSort(1).get(0)));
        assertEquals(0, city1.compareTo(cityList.getSort(1).get(1)));
    }


    /**
     * Assignment Part
     */


    /**
     * Delete City
     */
    @Test
    public void TestDelete() {
        CityList cityList = new CityList();
        City city1 = new City("Dhaka", "Farmgate");
        City city2 = new City("Khulna", "Jessore");

        cityList.add(city1);
        cityList.add(city2);

        cityList.Delete(city1);
        //city1 is deleted. So, it will not appear in the cityList
        assertTrue(cityList.getSort(1).contains(city1));

        //cityList only contains city2
        assertTrue(cityList.getSort(1).contains(city2));
    }

    /**
     * If the city doesn't exist, then it will through an exception.
     */
    @Test
    public void TestDeleteException() {
        CityList cityList = new CityList();
        City city1 = new City("Dhaka", "Farmgate");
        City city2 = new City("Khulna", "Jessore");

        cityList.add(city1);
        //city1 is in the cityList. So, it will be deleted
        cityList.Delete(city1);
        assertTrue(!cityList.getSort(1).contains(city1));

        //city2 is not in the cityList. So, it will throw an exception
        cityList.Delete(city2);
    }

    /**
     * Count the number of Cities
     */
    @Test
    public void TestCount() {
        CityList cityList = new CityList();
        City city1 = new City("Dhaka", "Farmgate");
        City city2 = new City("Khulna", "Jessore");
        City city3 = new City("Rajshahi", "Bogura");
        City city4 = new City("Chittagong", "Coxs Bazar");
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);

        assertEquals(4, cityList.Count());
    }

    /**
     * Test Sorting according to City and Province Name
     */
    @Test
    public void TestSort() {
        CityList cityList = new CityList();
        City city1 = new City("Dhaka", "Farmgate");
        City city2 = new City("Khulna", "Jessore");
        City city3 = new City("Rajshahi", "Bogura");
        City city4 = new City("Chittagong", "Coxs Bazar");
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);

        // Sort according to the City Name
        assertEquals(0, city4.compareTo(cityList.getSort(1).get(0)));

        // Sort according to the Province Name
//        assertEquals(0, city3.compareTo(cityList.getSort(2).get(0)));
    }

}
