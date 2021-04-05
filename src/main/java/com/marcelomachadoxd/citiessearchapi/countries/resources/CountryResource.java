package com.marcelomachadoxd.citiessearchapi.countries.resources;

import com.marcelomachadoxd.citiessearchapi.countries.entities.Country;
import com.marcelomachadoxd.citiessearchapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }

    @GetMapping("/page")
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

}
