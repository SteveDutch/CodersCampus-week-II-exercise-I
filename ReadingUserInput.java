package com.coderscampus.week2;
import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		Scanner readInput = new Scanner (System.in);
		System.out.println("please enter a number");
		String userInput = readInput.nextLine();
		Integer convertedUserInput = Integer.parseInt(userInput);
	    System.out.println(convertedUserInput);
	    
// comment

	}

}
