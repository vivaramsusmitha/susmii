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
		String s;
			Scanner in=new Scanner(System.in);
			s=in.next();
			 int words = 0;
		 while(in.hasNext())
	            {
	                in.next();
	                words++;
	            }
	            System.out.println((+words));

	}
}
