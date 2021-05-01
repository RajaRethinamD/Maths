package com.loops;

import java.util.ArrayList;
import java.util.List;

public class Loop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // collections map,hashmap,set,array,arraylist,
		list.add("hai");
		list.add("hello");
		
		// why loop concept -> the concept statment with diffrent values or same statement . 
		// for , while , do while , for each 
		boolean sensorCut = false;
		Loop loop = new Loop();
		
		// for ( initialization ; condition ; incremenet/decrement)
		for(;;)/*inifinity loop */ {
			
			if(loop.isSensorCut()) {
				System.out.println("alert.......");
				
				break;// continue
			}
			System.out.println("running");
			
		}
		
		/*for each*/
		String letter = "gokul";
		char[] eachchar = letter.toCharArray();
		for(char c : eachchar) {
			int ascii = c;
			System.out.println(c+" = "+ ascii); // (int)c -- type casting char to int
		}
		String name = "hi";
		List<String> list1 = new ArrayList<>(); // collections map,hashmap,set,array,arraylist,
		list1.add("hai");
		//list1.add(name);
		System.out.println(list1);
		
		// for ( each value : mainListvlaue)
		for(String s : list1) {
			System.out.println(s);
		}
		
		System.out.println("Raja");
		System.out.print("Vijay\n");
		System.out.print("Gokul\nLL");
		System.out.print("\nBalu");
	}

	private boolean isSensorCut() {
		// for ( initialization ; condition ; incremenet/decrement)
		for(int i=0;i<10;i++)
		{
			System.out.println("running for loop");
		}
		// initialization 
		// while( condition) {
		// increment/decrement
		//}
		int i=0;
		while(i<10)
		{
			System.out.println("running while loop");
			i++;
		}
		// initialize
		//do {
		// increment/decrement
		// } while(conditon)
		do {
			System.out.println("running do while loop");
			i++;
			System.out.println(i);
		}while(i<13);
		
		return true;
	}

}
