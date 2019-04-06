package Lab2;

public class Third {
	 int a,b,c,d,e;
	
	public Third(int f, int g, int h,int i,int j) {
		
		a=f;
		b=g;
		c=h;
		d=i;
		e=j;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" " );
		
	}

	public static void main(String[] args) {
		Third obj1 = new Third(1,2,3,4,5);
		
		Third obj2= new Third(4,5,2,6,2);
		
		Third obj3 = new Third(9,5,4,6,4);
		
		Third obj4= new Third(1,3,5,3,5);
		
		Third obj5 = new Third(0,7,5,7,3);
		
	}

}
