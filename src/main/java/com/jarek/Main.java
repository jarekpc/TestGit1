package com.jarek;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.printf("Godzina i data %s \n", dateTimeFormatter.format(localDateTime));
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
