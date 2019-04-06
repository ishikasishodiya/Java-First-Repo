package QUES2AND3;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("a is greatest number");
			
		}
		else if(b>=a && b>=c)
		{
			System.out.println("b is gratest number");
		}
		else {
			System.out.println("c is greatest number");
		}
	}

}
