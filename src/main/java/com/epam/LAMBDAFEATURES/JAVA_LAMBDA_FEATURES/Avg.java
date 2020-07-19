package com.epam.LAMBDAFEATURES.JAVA_LAMBDA_FEATURES;

import java.util.*;
public class Avg {
	public Double finding(ArrayList<Integer> list)
	{
		OptionalDouble average = list.stream().mapToInt(i->i).average();
		return average.getAsDouble();
	}
}
