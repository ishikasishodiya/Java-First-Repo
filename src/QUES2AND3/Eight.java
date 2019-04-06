package QUES2AND3;
import java.util.Scanner;
public class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int res2= 0;
		for(int i=0;i<10;i++)
		{
			
			arr[i]= sc.nextInt();
			int res = arr[i]*arr[i];
			System.out.print(res+" ");
			 
			}
		int res = 0;
		for(int i=0;i<10;i++)
		{
			
			 res = res+arr[i] ;
			 
		}
		//if i declare res insideloop then res canno be printed
		//then how when declaring outside ,correct new value of res is printed and not 0;
		//becoz calculation are inside loop only.
		// how res is able to be printed when outside loop
		
		System.out.println("sumof numbers is"+ res);	

	}

}
