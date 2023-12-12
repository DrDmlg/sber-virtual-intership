package org.example;

import org.example.model.City;
import org.example.service.ActionListImpl;
import org.example.service.CsvFileReader;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        CsvFileReader reader = new CsvFileReader();
        List<City> cities = reader.readLineFromFile("src/main/resources/dictionary.csv");
        ActionListImpl actionList = new ActionListImpl();

        actionList.print(cities);

        actionList.print(actionList.sortedByNameDesc(cities));

        actionList.print(actionList.sortedByDistrictAndName(cities));

        int[] array = actionList.convertListCitiesToArray(cities);
        actionList.findIndexElementWithLargestNumberCityPopulation(array);
    }
}