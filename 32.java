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
				  Scanner in=new Scanner(System.in);
            
            String s=in.nextLine();
           
            int res=count(s);
            System.out.println(+res);
        }


        private static int count(String s) {
            // TODO Auto-generated method stub
            int count=0;
            if(s.charAt(0)!=' '){
                count++;
            }
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)==' ')){
                    count++;
                }
  }
            return count;
	}

	
}
