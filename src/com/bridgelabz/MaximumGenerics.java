package com.bridgelabz;

import java.util.Scanner;

public class MaximumGenerics {
public static void main(String[] args) {
		
		Operation operation = new Operation();
		operation.getInputForInteger();
		int integerMax = operation.testMaximum(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(operation.max1+" is maximum amongst integer numbers");
		operation.getInputForFloat();
		float floatMax = operation.testMaximum(operation.number1,operation.number2,operation.number3);
		System.out.println(operation.max2+" is maximum amongst float numbers");
		operation.getInputForString();
		String stringMax = operation.testMaximum(operation.string1,operation.string2,operation.string3);
		System.out.println(operation.max3+" is maximum amongst strings");
	}

}