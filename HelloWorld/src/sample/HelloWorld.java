package sample;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
	
		System.out.println("Hello World, Welcome to Java Online Course!");
<<<<<<< HEAD
		System.out.println(" add from github....");
		System.out.println(" learn git from edle");
		System.out.println(" learn git from github");

=======
		System.out.println(" add from github");
		System.out.println(" learn git from edle");
		System.out.println(" learn git from github");

		
		System.out.println("this is for branch");
>>>>>>> changeMessage
		
//		take input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		
//		method calling
		int res = addition(num1, num2);
		System.out.println("The addition of two number is : " + res);
		
	    sc.close();
	}
	
	
//	Method signature
//	AccessModifier AccessSpecifire(optional) ReturnType MethodName
	
	public static int addition(int a, int b) {
		int sum = a + b;
//		System.out.println("The addition of two number is : " + sum);
		return sum;
		
	}

}
