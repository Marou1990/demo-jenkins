package com.test.jenkins.demojenkins.service;

import com.test.jenkins.demojenkins.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Personservice {
    ArrayList<Person> persons = new ArrayList<Person>();

    public Personservice() {
        Person p = new Person();
        p.setId("1");
        p.setAge(21);
        p.setFirstname("Khaled");
        p.setLastname("Amrosy");
        persons.add(p);

        p = new Person();
        p.setId("2");
        p.setAge(25);
        p.setFirstname("Mohammed");
        p.setLastname("Shalaby");
        persons.add(p);

        p = new Person();
        p.setId("3");
        p.setAge(25);
        p.setFirstname("Basem");
        p.setLastname("Salama");
        persons.add(p);

        p = new Person();
        p.setId("4");
        p.setAge(25);
        p.setFirstname("AbdulHalim");
        p.setLastname("Mahmoud");
        persons.add(p);

    }

    public Person getPerson(String id) {
        for(Person person:persons) {
            if(person.getId().equalsIgnoreCase(id)) return person;
        }
        return null;
    }
    public ArrayList<Person> getAll() {
        return persons;
    }

}
