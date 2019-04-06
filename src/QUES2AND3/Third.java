package QUES2AND3;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t= sc.nextInt();
	int a =0;
    System.out.print(" "+a);
	
	int res1=0;
	int res2=1;
	for(int i =0;i<t;i++)
	{
		res1 = res1+res2;
		res2 = res1-res2;
		System.out.print(" " +res1);
		
	}

	}
}
