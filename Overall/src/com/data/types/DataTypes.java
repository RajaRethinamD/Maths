package com.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataTypes {

	public static void main(String[] args) throws IOException {

		 int a = 10;
		    short s = 2;
		    byte b = 6;
		    long l = 125362133223l;
		    float f = 65.20298f;
		    double d = 876.765d;
		    System.out.println("The integer variable is " + a);
		    System.out.println("The short variable is " + s);
		    System.out.println("The byte variable is " + b);
		    System.out.println("The long variable is " + l);
		    System.out.println("The float variable is " + f);
		    System.out.println("The double variable is " + d);
		    // ascci code conversion
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String letter = reader.readLine();
			char[] eachchar = letter.toCharArray();
			for(char c : eachchar) {
				int ascii = c;
				System.out.println(c+" = "+ ascii); // (int)c -- type casting char to int
			}
			String name = "hi";
			List<String> list = new ArrayList<>(); // collections map,hashmap,set,array,arraylist,
			list.add("hai");
			list.add(name);
			
			
			//Array[]-- list of same data type , List
	}
	
//[Ljava.lang.String;@15db9742

}
