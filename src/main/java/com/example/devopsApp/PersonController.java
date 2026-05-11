package com.example.devopsApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {
private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/hello")
    public Person helloSayer( @RequestParam String name){
        return personService.getPerson("hello "+name);
    }
}
