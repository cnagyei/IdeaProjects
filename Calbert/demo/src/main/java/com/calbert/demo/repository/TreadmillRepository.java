package com.calbert.demo.model.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TreadmillRepository extends CrudRepository<Treadmill, String> {

    Treadmill findTreadmillByCodeContaining(String dd);
}
