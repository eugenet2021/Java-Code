package Assignments;

import java.util.Scanner;

/*Assignment 26- Write a program to create a class consist of static, Non Static and 
constructor method and call each of them in a parameterized way.
Assignment 27 - Write a Program to call non parameterized 
Constructor Overloading  - NOT POSSIBLE
Assignment 28 - Write a Program to call parameterized Constructor Overloading
*/
public class Constructor_A26 {

	public Constructor_A26(int a, int b) {
		int c = a*b;
		System.out.println(c);
		}
	public Constructor_A26(String a) {
		System.out.println(a);
	}
	public Constructor_A26(int a, String b) {
		System.out.println("Details you entered are " + a +" & " + b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Constructor_A26(10,25);
		 new Constructor_A26("Eugene");
		 
		 System.out.println("Enter your emp ID ");
			Scanner s1 = new Scanner(System.in);
			int id = s1.nextInt();
			System.out.println("Enter your City");
			String s = s1.next();
			new Constructor_A26(id, s);

	}

}
