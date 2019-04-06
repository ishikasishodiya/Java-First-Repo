package Lab2;

public class First
{
	 int a;
	public static void main(String[] args) {
	First obj = new First();
    obj.a=10;
	//System.out.println(obj.a=90);
    //if i dont initialize variable a as static outside main then to access it inside main
    //i have to access it using object like obj.a in print statement
    //what static do is we can access that variable without object anywhere.
	System.out.println(obj.a);
	
	
	}

}
