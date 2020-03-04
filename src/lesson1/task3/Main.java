package lesson1.task3;

import lesson1.task3.service.PersonService;
import lesson1.task3.struct.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<Person> people = new ArrayList<>(
            Arrays.asList(
                    new Person(20, "MAN", "vasya"),
                    new Person(24, "WOMAN", "nastya"),
                    new Person(15, "MAN", "petya")
            )
    );

    public static void main(String[] args) {
        PersonService personService = new PersonService();

        personService.sortBySex(people);
        System.out.println(people);
    }
}
