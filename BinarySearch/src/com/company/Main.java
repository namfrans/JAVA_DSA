package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kbd = new Scanner(System.in);
        int position;

        System.out.print("Enter your name or (-1) to exit: ");
        String name = kbd.nextLine();
        BinaryList names_list = new BinaryList(name);

        System.out.println(names_list);

        while (name != " "){
            if (names_list.getFullData().size() > 0){
                Collections.sort(names_list.getFullData());
            }
            position = names_list.BinarySearch(name);
            if (position != -1){
                System.out.println(names_list.toString());
                System.out.println("Your name sake is at position "+position+" and he's name is "+ names_list.getDataMatched(position));
            }else {
                names_list.getFullData().add(name);
                System.out.println(names_list.toString());
                System.out.println("Your name has not been found, we will stored it for to get your name sake next time.");
            }
            System.out.print("Enter your name: ");
            name = kbd.nextLine();
        }
    }
}
