package com.exercise6.util;
import java.util.Scanner;

public class InputUtil {
	public static int checkInteger() {
		Scanner userInput = new Scanner(System.in);
		String inputValue = new String();
		Integer output = new Integer(0);

		while (true){
			inputValue = userInput.nextLine();
			
			try{
				output = Integer.parseInt(inputValue);
				
				if (output < 1) {
					System.out.print("Input invalid. Input should be greater than 0: ");
				} else {
					break;
				}

			} catch (NumberFormatException ne) {
				System.out.print("Input not a number, please provide another: ");
			}
		}

		return output;
	}

	public static String getUserInput() {
		Scanner userInput = new Scanner(System.in);
		String output = userInput.nextLine();
		return output;
	}
}