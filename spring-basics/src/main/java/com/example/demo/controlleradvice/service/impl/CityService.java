package com.example.demo.controlleradvice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controlleradvice.exception.CityNotFoundException;
import com.example.demo.controlleradvice.exception.NoDataFoundException;
import com.example.demo.controlleradvice.model.City;
import com.example.demo.controlleradvice.repository.CityRepository;
import com.example.demo.controlleradvice.service.ICityService;

@Service
public class CityService implements ICityService{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public City findById(Long id) {

		return cityRepository.findById(id).orElseThrow(() -> new CityNotFoundException(id));
	}

	@Override
	public City save(City city) {

		return cityRepository.save(city);
	}

	@Override
	public List<City> findAll() {

		List<City> cities = (List<City>) cityRepository.findAll();

		if (cities.isEmpty()) {

			throw new NoDataFoundException();
		}

		return cities;
	}
}
