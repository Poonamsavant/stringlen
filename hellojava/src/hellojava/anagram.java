package hellojava;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String A = s.next();
		String B =s.next();
		char ch[] =new char[A.length()];
		char ch1[]= new char[B.length()];
		if(A.length() != B.length())
			System.out.println("Not anagram");
		else
		{
			A=A.toLowerCase();
			B=B.toLowerCase();
			ch =A.toCharArray();
			ch1 =B.toCharArray();
			Arrays.sort(ch);
			A= new String(ch);
			for(int i=0;i<A.length(); i++)
				for(int j=i+1; j<A.length(); j++)
				if(B.charAt(i)> B.charAt(j))
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
				B=new String(ch1);
				if(A.equals(B))
					System.out.println("anagram");
				else
					System.out.println(" not anagram");
		}


	}

}
