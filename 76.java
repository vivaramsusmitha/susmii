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
		Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	input.close();

	if (isComposite(n)) {
	    System.out.println("yes");
	} else {
	    System.out.println("no");
	}
    }

    public static boolean isComposite(int n) {
	if (n < 3) return false;
	for (int i = 2; i <= n / 2; i++) {
	    if (n % i == 0)return true;
	}
	return false;

	}
}
