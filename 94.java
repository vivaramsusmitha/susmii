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
		int n1,n2;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		int a[]=new int[20];
		for(int i=1;i<n1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(a[n2]);
	}
}
