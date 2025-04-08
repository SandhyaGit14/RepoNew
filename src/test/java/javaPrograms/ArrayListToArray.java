package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Cow");
		list.add("Pig");
		list.add("Dog");
		list.add("Stewart");
		System.out.println("ArrayList "+list);
		
		String[] arr = new String[list.size()];
		
		//ArrayList to Array
		list.toArray(arr);
		System.out.println("array Conversion ");
		for(String s:arr) {
			System.out.print(s+ " ");
		}

		
		//Array to ArrayList
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList(arr));
		System.out.println();
		System.out.println("To List " +l1);
		
		

	}

}
