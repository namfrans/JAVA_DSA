package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
	// write your code here
        //To be coded is a program that take input from user and match it search for a matching text in the earlier inserted names
        //Display the name sake full-name else insert the name into names array
        Scanner kbd = new Scanner(System.in);
        int position;

        System.out.print("Enter your name or (-1) to exit: ");
        String name = kbd.nextLine();
        LinearArray names_list = new LinearArray(name);

        while (name != "-1"){
            position = names_list.LinearSearch(name);
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
