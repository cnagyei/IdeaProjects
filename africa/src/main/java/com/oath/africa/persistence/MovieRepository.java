package com.oath.africa.persistence;

import com.oath.africa.business.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
