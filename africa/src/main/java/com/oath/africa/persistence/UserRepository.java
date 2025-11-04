package com.oath.africa.persistence;

import com.oath.africa.business.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
}
