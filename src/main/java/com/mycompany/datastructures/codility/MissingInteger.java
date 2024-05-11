package com.mycompany.datastructures.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger mi = new MissingInteger();
        System.out.println(mi.solution(new int[] {-1,-2}));
    }

    public int solution(int[] A) {
        HashSet<Integer> nums = new LinkedHashSet<>();

        for (int i =1; i<=A.length+1; i++) {
            nums.add(i);
        }

        for(int a: A) {
            nums.remove(a);
        }
        return nums.iterator().next();
    }
}
