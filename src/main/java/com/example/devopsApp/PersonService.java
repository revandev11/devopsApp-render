package com.example.devopsApp;

import org.hibernate.dialect.lock.LockingStrategy;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public Person getPerson(String name) {
       return personRepository.findByName(name).orElseThrow(()->new RuntimeException("person not found"));
    }

}
