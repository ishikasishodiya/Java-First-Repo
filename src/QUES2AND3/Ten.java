package QUES2AND3;

public class Ten {

	public static void main(String[] args) {
		int res = 0;
	for(int i =41; i< 250; i++ )
	{
		int b = i%5;
		if(b==0){
			res = res +i;
		}
		//System.out.println("the sum of numbers between 40 and 250 and divisie by 5 is"+res);
	}
	System.out.println("the sum of numbers between 40 and 250 and those divisie by 5 is"+res);
	}

}
