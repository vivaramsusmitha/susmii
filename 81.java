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
		int k,o;
		Scanner s=new Scanner(System.in);
		k=s.nextInt();
		o=s.nextInt();
		if(k>=(Math.pow(2,32))&&(o>=Math.pow(2,32)))
		{
			System.out.println("End of File");
			
		}
		else
		{
			System.out.print(o-k);
		}
	}
}
