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
		int n,m,l=0,k=0;
		int[] a=new int[10];
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		for(int j=0;j<m;j++)
		{
			a[j]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			if((a[i]%2)==0)
			{
				
			}
			else
			{
				k=a[i];
				l++;
				if(l==n)
				{
					System.out.print(k);
				}
			}
		}
	}
}
