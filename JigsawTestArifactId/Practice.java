package Package;

import java.util.Scanner;

public class Practice {
	
	int a=1;
	static int b=2;
	
	public static void Hello() {
		System.out.println(b);
		Practice p = new Practice();
		System.out.println(p.a);

				
	}
	public static void patterns() {

		System.out.println("This is a development");
		Scanner input = new Scanner(System.in);
		int givenInput=input.nextInt();
		String pattern="";
		for(int i =0;i<=givenInput;i++) {
			pattern =pattern+"*";
			System.out.println(pattern);
		}
	
	}
	public void hi() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void hi_hello() {
		
	}
	
public static void main(String args[]){
	String s1= "Helo";
	s1=s1+"l";
	System.out.println(s1);
	Practice.patterns();
	//Practice.Hello();
	//Practice ob1 = new Practice();
//	Practice ob2 = new Practice();
//	Practice ob3 = new Practice();
//	ob1.a=ob1.a+1;
	//System.out.println(ob1.a);
//	System.out.println(ob2.a);
//	System.out.println(ob3.a);
//	ob1.hi_hello();
	
	

}
}
