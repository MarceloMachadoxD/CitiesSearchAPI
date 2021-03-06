package com.marcelomachadoxd.citiessearchapi.countries.resources;

import com.marcelomachadoxd.citiessearchapi.countries.entities.Country;
import com.marcelomachadoxd.citiessearchapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }

    @GetMapping("/page") //request-example http://localhost:8080/countries/page?page=0&size=10&sort=name,asc
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }
    @GetMapping("/{id}") // request-example http://localhost:8080/countries/1
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());

        } else{
            return ResponseEntity.notFound().build();
        }
    }

}
