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
		int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
//	System.out.println("Enter any number:");
	//capture the input in an integer
	 int num=scan.nextInt();
        scan.close();
	 for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println("yes");
	else
	   System.out.println("no");

	}
}
