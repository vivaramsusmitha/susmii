/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereint 
		int count = 0,num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println(+ count);

		
	}
}
