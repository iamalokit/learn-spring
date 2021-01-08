package com.example.demo.controlleradvice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controlleradvice.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

}
