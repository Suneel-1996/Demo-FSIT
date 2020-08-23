package FirstPackage;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("This is a development");
		Scanner input = new Scanner(System.in);
		int givenInput=input.nextInt();
		String pattern="";
		for(int i =0;i<=givenInput;i--) {
			pattern =pattern+"*";
			System.out.println(pattern);
		}
	}

}
