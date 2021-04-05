package com.marcelomachadoxd.citiessearchapi.countries.repository;
import com.marcelomachadoxd.citiessearchapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {


}
