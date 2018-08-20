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
		float p, r, t;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        //System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
       // System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float  si;
        si = (r * t * p) / 100;
        System.out.print(+(int)si);

	}
}
