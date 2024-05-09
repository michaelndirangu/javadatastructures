package com.mycompany.datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void  main(String[] args) {
        Set<Ball> ballSet = new LinkedHashSet<>();

        ballSet.add(new Ball("blue"));
        ballSet.add(new Ball(("yellow")));
        ballSet.add(new Ball("red"));

        System.out.println(ballSet);
        ballSet.forEach(System.out::println);
    }

    record Ball(String name){};
}
