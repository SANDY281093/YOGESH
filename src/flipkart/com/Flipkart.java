package flipkart.com;

public class Flipkart {
	public static void main(String[] args) {
		int a=10,b=20;
	b=b-a;
	a=a+b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
	
	int c=a;
	a=b;
	b=c;
	
	System.out.println(c);
	
	a=b;
	b=b+b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);


	}

}
