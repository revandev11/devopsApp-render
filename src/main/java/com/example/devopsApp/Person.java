package com.example.devopsApp;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String name;

    public Person(){}

}
