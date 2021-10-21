package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Enter a word (String) ");
    String word = input.nextLine();
    System.out.println("Enter a whole number(int) ");
    int number = input.nextInt();
    char result = word.charAt(number);
    System.out.println(result);





    }
}
