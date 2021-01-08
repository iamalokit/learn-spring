package com.example.demo.controlleradvice.service;

import java.util.List;

import com.example.demo.controlleradvice.model.City;

public interface ICityService {
	City findById(Long id);
    City save(City city);
    List<City> findAll();
}
