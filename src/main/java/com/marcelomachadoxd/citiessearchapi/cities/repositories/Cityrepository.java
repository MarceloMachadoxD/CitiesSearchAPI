package com.marcelomachadoxd.citiessearchapi.cities.repositories;

import com.marcelomachadoxd.citiessearchapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cityrepository extends JpaRepository<City, Long> {
}
