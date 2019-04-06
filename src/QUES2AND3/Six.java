package QUES2AND3;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		//int n = sc.nextInt();
		int[] arr = new int[10];
				for(int i =0; i<10;i++)
				{
					 arr[i]=  sc.nextInt();
					 
				}
				//for loop k scope k bahar arr[i] accessible nhi tha!!
				System.out.print("the sorted array is ");
			for(int i =0;i<10;i++)
				{
				for(int j= i;j<10;j++)
				{
					
					if(arr[i] > arr[j])
					{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					}
					
				}
				System.out.print(" "+arr[i]);
				if(arr[i]>=40 && arr[i]<=50)
				{
					
				}
					
					
				}
			
				}
				
}
