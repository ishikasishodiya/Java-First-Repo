package QUES2AND3;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the first number is "+ args[0]);
		System.out.println("the second number is "+ args[1]);
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = sc.nextInt();
		switch(k){
		case 1 :
			int res = i+j;
			System.out.println("result of addition is "+ res);
			break;
		case 2 :
			int res2 = i - j;
			System.out.println("result of subtraction is "+res2);
			break;
		case 3 :
			double res3 = i * j; 
			System.out.println("the result of multiplication is "+res3);
			break;
		case 4 :
			float res4 = i/j;
			System.out.println("the result of division is"+ res4);
			break;
		default:
			System.out.println("enter a number 1 to 4");
		}

	}

}
