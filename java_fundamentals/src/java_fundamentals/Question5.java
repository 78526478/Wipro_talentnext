package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("a is even ");
		}
		else {
			System.out.println("a is odd");
		}
		sc.close();

	}

}
