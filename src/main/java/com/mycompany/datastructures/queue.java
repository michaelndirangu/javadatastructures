package com.mycompany.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class queue {
    public static  void main(String[] args) {
    LinkedList<Person> list = new LinkedList<>();

    list.add(new Person("Alex", 26));
    list.add(new Person("Joe", 21));
    ListIterator<Person> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
        System.out.println(listIterator.next());
    }

    while (listIterator.hasPrevious()) {
        System.out.println(listIterator.previous());
    }


    }

    private static void queues() {
        Queue<Person> persons = new LinkedList<>();

        persons.add(new Person("James Mwangi", 24));
        persons.add(new Person("James Mwangi", 20));
        persons.add(new Person("Alicia", 21));

        System.out.println("The queue is : "+persons);
        System.out.println(persons.peek());
        System.out.println(persons.size());


    }

    public static record Person(String name, Integer age) {};
}
