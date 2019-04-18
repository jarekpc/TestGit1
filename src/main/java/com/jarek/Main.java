package com.jarek;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double a = 12.2;
        System.out.format("To jest wartosc %f\n", a);
        long n = 45012;
        System.out.format("%d%n",n);
        System.out.println("Printing even numbers: " + n);

        Person jarek = new Person("Jarek", "Zyzak", 38);
        Person monika = new Person("Monika", "Zyzak", 34);
        Person wojtek = new Person("Wojciech", "Borkała", 34);

        List<Person> personList = Arrays.asList(jarek, monika,wojtek);
//        personList.stream().forEach(System.out::println);
        personList.stream().filter(u -> u.getAge() > 35).map(map -> map.getFirstName()).forEach(System.out::println);

    }
}
