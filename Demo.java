package stringArrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		//Declaration
		
		String Student[] = new String[4];
		// String Student[] = {"abc","xyz"};      // Another Syntax of Declaration
		
		//Initialization
		
		Student[0]="1abc";
		Student[1]="3def";
		Student[2]="4ghi";
		Student[3]="2jkl";
	//	Student[4]="6mno";
	//	Student[5]="5pqr";
		
		
		System.out.println("_____Original Array______");
		for(int i=0;i<=Student.length-1;i++)
		{
			System.out.println(Student[i]);
			
		}
		
		System.out.println("_____Ascending Order______");
		Arrays.sort(Student);
		for(int i=0;i<=Student.length-1;i++)
		{
			System.out.println(Student[i]);	
		}

		System.out.println("_____Descending Order______");
		for(int i=Student.length-1;i<Student.length;i--)
		{
			System.out.println(Student[i]);	
		}
}
}
