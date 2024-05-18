package com.mycompany.datastructures.codility;

import java.util.HashSet;

public class PermCheck {

    public int solution(int[] A) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i =1; i<=A.length; i++) {
            numbers.add(i);
        }

        for(int a: A) {
            if (!numbers.contains(a)) {
                return 0;
            } else {
                numbers.remove(a);
            }
        }

        return numbers.isEmpty() ? 1: 0;
    }
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[] {1,3}));
    }
}
