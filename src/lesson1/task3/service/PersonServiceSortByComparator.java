package lesson1.task3.service;

import lesson1.task3.struct.Person;

import java.util.Comparator;
import java.util.List;

public class PersonServiceSortByComparator implements IPersonServiceSort {

    public PersonServiceSortByComparator() {}

    @Override
    public void sortByName(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }

    @Override
    public void sortByAge(List<Person> people) {
        people.sort((o1, o2) -> o2.getAge() - o1.getAge());
    }

    @Override
    public void sortBySex(List<Person> people) {
        people.sort(Comparator.comparing(Person::getSex));
    }

    @Override
    public void sort(List<Person> people) {
        sortByName(people);
        sortByAge(people);
        sortBySex(people);
    }
}
