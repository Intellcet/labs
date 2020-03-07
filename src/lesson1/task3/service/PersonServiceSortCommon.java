package lesson1.task3.service;

import lesson1.task3.struct.Person;

import java.util.List;

public class PersonServiceSortCommon implements IPersonServiceSort {

    private Person person;

    public PersonServiceSortCommon() {
        this.person = null;
    }

    private void swap(List<Person> people, int firstIndex, int secondIndex) {
        this.person = people.get(firstIndex);
        people.set(firstIndex, people.get(secondIndex));
        people.set(secondIndex, this.person);
    }

    @Override
    public void sortByName(List<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getName().compareTo(people.get(j).getName()) < 0) {
                    swap(people, i, j);
                }
            }
        }
    }

    @Override
    public void sortByAge(List<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getAge() < people.get(j).getAge()) {
                    swap(people, i, j);
                }
            }
        }
    }

    @Override
    public void sortBySex(List<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getSex().compareTo(people.get(j).getSex()) < 0) {
                    swap(people, i, j);
                }
            }
        }
    }

    @Override
    public void sort(List<Person> people) {
        sortByName(people);
        sortByAge(people);
        sortBySex(people);
    }
}
