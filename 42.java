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
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		if(str1.length()>str2.length())
		{
			System.out.println(str1);
		}
		else
		{
				System.out.println(str2);
			
		}
	}
}
