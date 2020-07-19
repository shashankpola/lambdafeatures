package com.epam.LAMBDAFEATURES.JAVA_LAMBDA_FEATURES;
import java.util.*;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = scnr.nextInt();
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			ar.add(scnr.next());
		}
		Pa p = (ArrayList<String> lists)-> 
		{
			ArrayList<String> result = new ArrayList<String>();
			for(String s:lists)
			{
				String temp1 = s;
				StringBuilder sb = new StringBuilder(s);
				String temp2 = sb.reverse().toString();
				if(temp1.equals(temp2))
				{
					result.add(temp1);
				}
			}
			return result;
		};
		
		System.out.println("Palindromes :" + p.ret(ar));
		scnr.close();
		
	}

}
