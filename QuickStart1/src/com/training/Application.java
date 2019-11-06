package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String args[]) {
		List<String> nameList = Arrays.asList("Ramesh","Suresh","Magesh");
		nameList.forEach(System.out::println);
		
		for(String eachItem:nameList) {
			System.out.println(eachItem);
		}
	}
}
