package com.example.ExampleSoap.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Person implements Serializable {
    private String dni;
    private String name;
    private String lastName;
    private String age;
    private String country;

    public Person() {
    }

    public Person(String dni, String name, String lastName, String age, String country) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
