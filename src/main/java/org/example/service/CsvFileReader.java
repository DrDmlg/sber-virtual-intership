package org.example.service;

import org.example.model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvFileReader {

    private final String DELIMITER = ";";

    public List<City> readLineFromFile(String path) throws FileNotFoundException {
        List<City> cities = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] substring = line.split(DELIMITER);

            String name = substring[1];
            String region = substring[2];
            String district = substring[3];
            Integer population = Integer.parseInt(substring[4]);

            String foundation;
            try {
                foundation = substring[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                foundation = "";
            }

            cities.add(new City(name, region, district, population, foundation));
        }
        return cities;
    }
}
