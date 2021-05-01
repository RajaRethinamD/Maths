package com.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic {
// add , sub , mul , div need to ask ?
	public static void main (String[] args) throws IOException {
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		System.out.println("Enter choise \n 1.add \n 2.sub : ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String choise = reader.readLine();
		if(choise.equalsIgnoreCase("1") || choise.equalsIgnoreCase("2")) { // or|| and && 
			
		System.out.println("Enter 1st number : ");
		String first = reader.readLine();
		int a = Integer.parseInt(first); // convert
		System.out.println("Enter 2nd number : ");
		String second = reader.readLine();
		int b = Integer.parseInt(second);
		
		if(choise.equalsIgnoreCase("1")) {
			System.out.println("Answer = " + addition.add(a, b));
		}else if(choise.equalsIgnoreCase("2")){
			System.out.println(" Answer = " + subtraction.sub(a, b));
		}
	}else {
		System.out.println("enter correct choise 1 or 2");
	}
	}
}
