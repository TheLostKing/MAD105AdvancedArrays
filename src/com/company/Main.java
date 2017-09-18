package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        int book, amount;
        String[][] ruleBookList ={ {"Pathfinder", "Starfinder", "Burning Wheel", "Star Wars FFG", "Godbound"},
        {"4", "10,", "53" , "34", "45"}};

        System.out.print("Which book do you want to see?\n1. Pathfinder\n2. Starfinder\n3.Burning Wheel\n4. Starwars FFG\n5. Godbound");
        book = scan.nextInt();

        System.out.print("There are " + ruleBookList[book][1] + " copies of " + ruleBookList[book][0]);

        System.out.print("How many books do you want to add(If taking use negative numbers)?");
        amount = scan.nextInt();

        if(Integer.parseInt(ruleBookList[book][1]) + amount < 0){
            System.out.print("Error, that would make a negative amount of books");
        }else {
            System.out.print("Book: " + ruleBookList[book][0] + "amount added: " + amount + "New Total: " + ruleBookList[book][1]);
        }


    }
}
