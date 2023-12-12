package org.example.repository;

import org.example.model.City;

import java.util.List;

public interface ActionList {

    List<City> sortedByNameDesc(List<City> list);

    List<City> sortedByDistrictAndName(List<City> list);

    int[] convertListCitiesToArray(List<City> list);

    void findIndexElementWithLargestNumberCityPopulation(int[] array);

    void print(List<City> list);
}
