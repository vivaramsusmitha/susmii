/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
//System.out.println("Before swapping:");

		//System.out.println(+ a);
	//	System.out.println(+ b);

		a = a ^ b; // XOR operation
		b = a ^ b; // XOR operation
		a = a ^ b; // XOR operation

		//System.out.println("After swapping:");
		System.out.println(+ a+" "+b);
	//	System.out.println(+ b);

	}
}
