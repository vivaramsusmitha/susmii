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
		int count=0;
           Scanner sc=new Scanner(System.in);
           String str1=" !@#$% &^*() +}{: ><?|[ ].,'?`/- ";
           String str;
           str=sc.next();
           for(int i=0;i<str.length();++i)
           {
           	 if(str1.contains(Character.toString(str.charAt(i))))
           	 {
           	 	count++;
           	 }
           }
           System.out.println(count);

	}
}
