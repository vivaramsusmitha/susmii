import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		System.out.println("enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		System.out.println("Yes");
		else
		System.out.println("no");
	}
}
