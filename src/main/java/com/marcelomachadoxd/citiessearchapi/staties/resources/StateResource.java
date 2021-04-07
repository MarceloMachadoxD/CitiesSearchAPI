package com.marcelomachadoxd.citiessearchapi.staties.resources;

import com.marcelomachadoxd.citiessearchapi.countries.entities.Country;
import com.marcelomachadoxd.citiessearchapi.staties.entities.State;
import com.marcelomachadoxd.citiessearchapi.staties.repositories.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping  // http://localhost:8080/staties/
    public List<State> staties() {
        return repository.findAll();
    }

    @GetMapping("/page") //http://localhost:8080/staties/page?sort=name,desc
    public Page<State> countries(Pageable state){
        return repository.findAll(state);
    }

}


