package com.mycompany.datastructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        //stacks, lifo

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
