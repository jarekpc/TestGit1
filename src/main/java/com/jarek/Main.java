package com.jarek;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witam w metodzie Main dodano w testingu!");
        LocalDate now = LocalDate.now();
        System.out.printf("Dzisiaj jest %s \n", now );
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
        personList.stream().filter(u -> u.getAge() > 33).map(map -> map.getFirstName()).forEach(System.out::println);

    }
}
