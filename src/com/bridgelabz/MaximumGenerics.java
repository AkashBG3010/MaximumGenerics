package com.bridgelabz;

import java.util.Scanner;

public class MaximumGenerics {
	
	public static void main(String[] args) {
		Integer Int1 = 100 , Int2 = 1299, Int3 = 357; 
		Float float1 = 9.7f , float2 = 196.3f, float3 = 0.5f; 
		String xString = "Gauva" , yString = "Apple", zString = "Pappaya";

		Operation operationI = new Operation(Int1,Int2,Int3);
		int integerMax = operationI.testMaximum(Int1,Int2,Int3);
		operationI.printMax(Int1, Int2, Int3,integerMax);
		
		Operation operationF = new Operation(float1,float2,float3);
		float floatMax = operationF.testMaximum(float1,float2,float3);
		operationF.printMax(float1,float2,float3,floatMax);
		
		Operation operationS = new Operation(xString,yString,zString);
		String stringMax = operationS.testMaximum(xString,yString,zString);
		operationS.printMax(xString,yString,zString,stringMax);
	}
}