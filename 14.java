import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int m,n;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
	    for(int i=m; i<n; i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }  
			System.out.println();

	}
}
