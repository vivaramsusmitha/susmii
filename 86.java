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
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s1=s1.toLowerCase();
		char[] c1=s1.toCharArray();
		int a=0;
		Arrays.sort(c1);
		for(int i=0;i<s1.length()-1;i++)
		{
			if(c1[i]==c1[i+1])
			{
				a++;
			}
		}
		if(a==0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}
}
