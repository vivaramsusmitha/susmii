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
		int x, y, temp;
 
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
 
 //     System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
 
      temp = x;
      x = y;
      y = temp;
 
      System.out.println(+x+" "+y);

	}
}
