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
		int n,med=0,temp;
		int[] a=new int[10];
		Scanner  sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		temp=0;
				for(int i=0;i<n;i++)
				{
							for(int j=i+1;j<n;j++)
							{
								if(a[i]>a[j])
								{
									temp=a[i];
									a[i]=a[j];
									a[j]=temp;
								}
							}

				}
				if(n%2==0)
				{
					med=(a[n/2]=a[(n/2)+1])/2;
					System.out.print(med);
				}
				else
				{
					med=a[n/2];
					System.out.print(med);
				}

	}
}
