package com.oath.africa.presentation;

import com.oath.africa.business.Person;
import com.oath.africa.business.PersonService;
import com.oath.africa.persistence.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PatchMapping("/person")
    public void updatePerson() {
        personService.doProgrammaticTransaction();
    }
}
