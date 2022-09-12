package com.assignment.array;

public class ArrayAssignment {

	public static void main(String[] args) {
		
   int sum =0;
   int[] array1 = {1,2,3,4,0,0,0,0,0,0};
   
   for(int i=0;i<array1.length;i++)
   {
	   sum=sum+array1[i];
	   
   }
   System.out.println(sum);
	}

}
