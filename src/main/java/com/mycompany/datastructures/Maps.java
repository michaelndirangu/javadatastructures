package com.mycompany.datastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));

        System.out.println(map.containsKey(4));
        System.out.println(map);
        System.out.println(map.entrySet());
        map.entrySet().forEach(System.out::println);

        map.forEach((key, value) -> System.out.println(key + "" + value));

        List<Integer> nums = List.of(1, 2, 3, 5, 6, 8);
    }

    record Person(String name){};
}
