package javaPrograms;

import java.math.BigInteger;

public class AddStringNums {

	public static void main(String[] args) {
	        String str="500";
	        String str1="400";
	         
			/*
			 * BigInteger a=new BigInteger(str); // creating obj of biginteger and pass str
			 * in it BigInteger b=new BigInteger(str1); // creating obj of biginteger and
			 * pass str1 in it
			 * 
			 * BigInteger res; res = a.add(b);
			 */
	       
	        BigInteger a= new BigInteger(str);
	        BigInteger b= new BigInteger(str1);
	        BigInteger res;
	        res=a.add(b);	        
	        System.out.println( res.toString()); //add
	         
	        System.out.println("Om 1");
	     }

	}

