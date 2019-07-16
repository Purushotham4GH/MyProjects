package com.test;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class Om {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wellcome to Java world!");

		int a = 5;
		int b = 7;
		int c;
		
		c = (a+b);
		System.out.println("The Sum of a and b is: " +c );
		
		JUnitCore.runClasses(TestSample.class);
	}


}

