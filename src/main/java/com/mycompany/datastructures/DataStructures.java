/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructures;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author michael
 */
public class DataStructures {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }

        for(String color: colors) {
            System.out.println("the color is "+color);
        }

        Arrays.stream(colors).forEach(System.out::println);

        System.out.println("My array: "+ Arrays.toString(colors));

        //2d arrays
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        char[][] board2 = new char[][] {
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'}
        };

        board[1][2] = 'A';

        System.out.println("elements "+Arrays.deepToString(board));

        List<String> colorList = List.of("black");

    }

}
