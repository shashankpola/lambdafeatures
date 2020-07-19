package com.epam.LAMBDAFEATURES.JAVA_LAMBDA_FEATURES;
import java.util.*;
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeCh ob = new ThreeCh();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = scnr.nextInt();
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			ar.add(scnr.next());
		}
		
		System.out.println("Strings starting with \"a\" and has 3 characters are ");
		List<String> result = ob.ret(ar);
		for(String s : result)
		{
			System.out.println(s);
		}
		scnr.close();
	}
}
