package org.example.service;

import org.example.model.City;
import org.example.repository.ActionList;

import java.util.Comparator;
import java.util.List;

public class ActionListImpl implements ActionList {

    @Override
    public List<City> sortedByNameDesc(List<City> list) {
        return list.stream()
                .sorted((city1, city2) ->
                        String.CASE_INSENSITIVE_ORDER.compare(city1.getName(), city2.getName()))
                .toList();
    }

    @Override
    public List<City> sortedByDistrictAndName(List<City> list) {
        return list.stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName))
                .toList();
    }

    @Override
    public void print(List<City> list) {
        list.forEach(System.out::println);
    }
}
