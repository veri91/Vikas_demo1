package com.example.demo1.service;

import com.example.demo1.dao.PersonDao;
import com.example.demo1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {
    public final PersonDao personDao;
    @Autowired

    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }
    public  int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
    public List<Person> getallPeople() {
        return personDao.selectallPeople();
    }
    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }
    public  int deletperson(UUID id) {
        return personDao.deletePersonById(id);
    }
    public  int updatePerson(UUID id, Person newPerson) {
        return personDao.updatePersonById(id, newPerson);
    }
}

