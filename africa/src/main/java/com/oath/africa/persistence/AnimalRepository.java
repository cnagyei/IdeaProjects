package com.oath.africa.persistence;

import com.oath.africa.business.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT animal FROM Animal animal WHERE animal.habitat = :habitat")
    List<Animal> findAnimalByHabitat(@Param("habitat") String habitat);

    @Query(value = "SELECT * FROM animal ORDER BY age DESC LIMIT 3", nativeQuery = true)
    List<Animal> getAllAnimalsByQuery();
}
