package hellojava;
import java.util.*;
public class lengthstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String A = s.next();
		String B = s.next();
		// first operation is sum of two string length
		System.out.println(A.length()+B.length());
		// second operation is determine  if a is lexicographically larger than b
		//System.out.println(A.compareTo  (B))
		if(A.compareTo (B)>0)
		{
		System.out.println(" yes");
		}
		else
		{
		System.out.println(" no");
		}
		// third operation capitlize the first letter in A and B
		System.out.println (A.substring(0,1).toUpperCase() + A.substring(1)+ " " +B.substring(0,1).toUpperCase() + B.substring(1));


	}

}
