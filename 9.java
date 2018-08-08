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
	       int N,K,sum=0;
	      Scanner s=new Scanner(System.in);
	      N=s.nextInt();
	      K=s.nextInt();
	      int[] a=new int[10];
	      for(int i=0;i<N;i++)
	      {
	          a[i]=s.nextInt();
	          if(i<K)
	          {
	      	    sum=sum+a[i];
	          }
	      }      
	      System.out.println(sum);
	}
}
	
