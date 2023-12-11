package org.example.converter;

import org.example.model.City;

public class CityConverter {

    private static final String DELIMITER = ";";

    public static City toModelConverter(String line) {
        String[] substring = line.split(DELIMITER);

        Long id = Long.parseLong(substring[0]);
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

        return new City(id, name, region, district, population, foundation);
    }
}
