package com.test.jenkins.demojenkins.controller;

import com.test.jenkins.demojenkins.model.Person;
import com.test.jenkins.demojenkins.service.Personservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@CrossOrigin
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    Personservice ps;

    @RequestMapping("/all")
    public ArrayList<Person> getAll() {
        return ps.getAll();
    }

    @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return ps.getPerson(id);
    }

}
