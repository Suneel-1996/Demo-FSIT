package FirstPackage;

import java.util.Scanner;

public class First {
public static void reversePatterns() {

		
		Scanner input = new Scanner(System.in);
		int givenInput=input.nextInt();
		int s=givenInput-1;
		int st=1;
		while(givenInput>0) {
			
			
			for(int spaces=0;spaces<s;spaces++) {
				System.out.print(" ");
				
			}
			for(int stars=0;stars<st;stars++) {
				System.out.print("*");
			}
			System.out.println("");
			s=s-1;
			st=st+1;
			givenInput-=1;
		}
}
	public static void main(String[] args) {
		System.out.println("This is a development");
		Scanner input = new Scanner(System.in);
		int givenInput=input.nextInt();
		String pattern=" ";
		for(int i =0;i<=givenInput;i--) {
			pattern =pattern+"*";
			System.out.println(pattern);
		}
	}

}
