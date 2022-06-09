package com.assignment2;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
	
	// method to sort arrayList in descending order
	public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> arr){
		// Using inbuilt method of Collections class to sort in reverse order
		Collections.sort(arr,Collections.reverseOrder());
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creating an arrayList of type - BigInteger
		ArrayList<BigInteger> arr = new ArrayList<>();
		
		// taking input of size of arrayList by user
		System.out.println("Enter size of the arrayList : ");
	    int size = sc.nextInt();
	    
	    // adding values to the list
	    for(int i=1 ; i<=size ; i++) {
	    	BigInteger x = sc.nextBigInteger();
	    	arr.add(x);
	    }
	    
	    // arrayList before sorting:
	    System.out.println("Before sorting :\n"+arr);
	    
	    // arrayList after sorting:
	    System.out.println("After sorting :\n"+arrayListSortDesc(arr));
		

	}

}
