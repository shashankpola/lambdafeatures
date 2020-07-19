package com.epam.LAMBDAFEATURES.JAVA_LAMBDA_FEATURES;

import java.util.*;
public class Find {
	public static void main(String[] args) 
	{
		Avg  avg = new Avg();
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int n = scnr.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(scnr.nextInt());
		}
		System.out.println("average is "+ avg.finding(list));
	scnr.close();
	}

}
