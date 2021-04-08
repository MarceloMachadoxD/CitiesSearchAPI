package com.marcelomachadoxd.citiessearchapi.cities.resources;

import com.marcelomachadoxd.citiessearchapi.cities.entities.City;
import com.marcelomachadoxd.citiessearchapi.cities.repositories.Cityrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityResourse {


    private final Cityrepository cityrepository;

    public CityResourse(final Cityrepository repository) {
        this.cityrepository = repository;
    }

/*  @GetMapping
  public List<City> cities() {
      return cityrepository.findAll();
  }*/


    @GetMapping("/page")
    public Page<City> cities(final Pageable page) {
        return cityrepository.findAll(page);
    }
}
