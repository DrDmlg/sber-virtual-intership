package org.example;

import org.example.model.City;
import org.example.repository.CityReader;
import org.example.service.CityCsvReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityReader reader = new CityCsvReader();
        List<City> cities = reader.csvFileReader("src/main/resources/Task_BC_Java_Sber.csv");

        cities.forEach(System.out::println);
    }
}