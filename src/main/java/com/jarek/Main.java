package com.jarek;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person jarek = new Person("Jarek", "Zyzak", 38);
        Person monika = new Person("Monika", "Zyzak", 34);
        Person wojtek = new Person("Wojciech", "Borkała", 34);

        List<Person> personList = Arrays.asList(jarek, monika,wojtek);
        personList.stream().filter(u -> u.getAge() > 33).map(map -> map.getFirstName()).forEach(System.out::println);

    }
}
