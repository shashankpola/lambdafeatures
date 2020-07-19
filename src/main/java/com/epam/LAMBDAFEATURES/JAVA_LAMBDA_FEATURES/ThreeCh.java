package com.epam.LAMBDAFEATURES.JAVA_LAMBDA_FEATURES;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeCh {
	public List<String> ret(ArrayList<String> list)
	{
		List<String> result = list.stream().filter(s->(s.startsWith("a") && s.length()==3)).collect(Collectors.toList());
		return result;
	}

}
