package org.example.repository;

import org.example.model.City;

import java.util.List;

public interface CityReader {

    List<City> csvFileReader(String path);

}
