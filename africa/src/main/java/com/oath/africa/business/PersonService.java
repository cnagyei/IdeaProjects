package com.oath.africa.business;

import com.oath.africa.persistence.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PlatformTransactionManager transactionManager;

    public PersonService(PersonRepository personRepository,
                         PlatformTransactionManager transactionManager) {
        this.personRepository = personRepository;
        this.transactionManager = transactionManager;
    }

    // Declarative transaction management - through configuration with annotations
    @Transactional
    public void doTransaction() {
        Person person = new Person();

        person.setFirstName("John");
        personRepository.save(person); // Insert

        if (person.getId() > 0) {
            throw new RuntimeException();
        }

        person.setLastName("Doe");
        person.setAge(23);
        personRepository.save(person); // Update
    }

    // Programmatic transaction management - through writing code
    public void doProgrammaticTransaction() {
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);

        try {
            var person = new Person();
            person.setFirstName("Mike");
            personRepository.save(person); // Insert

            person.setLastName("Buabeng");
            personRepository.save(person); // Update

            transactionManager.commit(status);
        } catch (Exception ex) {
            ex.printStackTrace();
            transactionManager.rollback(status);
        }
    }
}
