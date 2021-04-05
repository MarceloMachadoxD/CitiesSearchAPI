package com.marcelomachadoxd.citiessearchapi.countries.repository;

import com.marcelomachadoxd.citiessearchapi.countries.entities.Country;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
