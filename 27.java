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
		String n;
		  boolean b;
		  Scanner s=new Scanner(System.in);
		  n=s.next();
		  b=(n.matches("-?\\d+(\\.\\d+)?"));
		  if(b)
		  {
		  	System.out.print("Yes");
		  	
		  }
		  else
		  {
		  	System.out.print("no");
		  }
	}
}
