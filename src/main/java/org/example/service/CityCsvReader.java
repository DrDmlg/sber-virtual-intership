package org.example.service;

import org.example.converter.CityConverter;
import org.example.model.City;
import org.example.repository.CityReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityCsvReader implements CityReader {

    private List<City> cityList = new ArrayList<>();

    @Override
    public List<City> csvFileReader(String path) {
        List<City> cityList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNext()) {
                cityList.add(CityConverter.toModelConverter(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cityList;
    }

    public List<City> getCityList() {
        return cityList;
    }
}
