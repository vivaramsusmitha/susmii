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
		int n,res=0;
	
       Scanner sc=new Scanner(System.in);
 
       //System.out.println("enter how many numbers to cal  avg");
	   
       n=sc.nextInt();
 
       int a[]=new int[n];
 
       //System.out.println("enter   "+n+"  numbers");
 
       for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
 
       for(int i=0;i<n;i++)
	   res =res+a[i];
 	 	    
        System.out.println(+res/n);

	}
}
