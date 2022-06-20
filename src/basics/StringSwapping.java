package basics;

import java.util.Scanner;

public class StringSwapping {

	public static void main(String[] args) {
		String x, y, temp;

		System.out.println("Enter x and y:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		y = sc.nextLine();

		System.out.println("before swapping:" + "\nx=" + x + "\ny=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("after swapping:" + "\nx=" + x + "\ny=" + y);
		
		//strings 
		String str = "Kumar";
		System.out.println(str.substring(1));

		sc.close();

	}

}
