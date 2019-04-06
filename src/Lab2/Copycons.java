package Lab2;

public class Copycons {
	int number;
	String name;
	public Copycons(int a,String b){
		
		number = a;
		name = b;
		
	}
public Copycons(Copycons s) {
	number = s.number;
	name =s.name;
}
	
public void dislay() {
	System.out.println("the value of a nd b is "+number+name);
}
	public static void main(String[] args) {
		Copycons obj1 = new Copycons(10,"ishu");
		Copycons obj2 = new Copycons(obj1);
		
		obj1.dislay();
		obj2.dislay();

	}

}
//the variable defined in one constructor cannot be accessed by another.
//so we did number =a; because number was declared outside any constructor.
//copy constructor copies value of obj1 into obj2