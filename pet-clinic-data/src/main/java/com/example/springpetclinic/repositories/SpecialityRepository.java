package com.example.springpetclinic.repositories;

import com.example.springpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
