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
		int n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[20];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				count=count+1;
			}
			
		}
		if(count>=1)
		System.out.println("yes");
		else
		System.out.println("no");
			
		
	}
}