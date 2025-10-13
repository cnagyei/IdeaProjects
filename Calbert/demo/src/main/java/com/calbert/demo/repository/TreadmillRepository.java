package com.calbert.demo.repository;

import com.calbert.demo.model.entity.Treadmill;
import org.springframework.data.repository.CrudRepository;

public interface TreadmillRepository extends CrudRepository<Treadmill, String> {}
