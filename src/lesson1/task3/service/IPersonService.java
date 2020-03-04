package lesson1.task3.service;

import lesson1.task3.struct.Person;

import java.util.List;

public interface IPersonService {
    void sortByName(List<Person> people);
    void sortByAge(List<Person> people);
    void sortBySex(List<Person> people);
}
