package Lab2;

public class Four {
//using parametrized constructor
	//constructor overloading
	//multiple constructors with different parameters
	//so multiple objects formed
	public Four(int a) {
		System.out.println("the value of a is "+a);
		
	}
	public  Four(String b) {
		System.out.println("the value of b is "+b);
		
	}
	public  Four(int c,String d) {
		System.out.println("the value of c and d is "+c+d);
		
	}
	public static void main(String[] args) {
		Four obj1 =new Four(10);
		Four obj2 =new Four("hello");
		Four obj3 =new Four(18,"bye");
		

	}

}
