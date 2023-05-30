package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		System.out.println(sum());
		int x=sum();
		
		System.out.println(hello()); //prints hello java
		String y=hello();
		System.out.println(y); // prints hello java

	}
public static int sum() {
	int a=4+5;
	return a;
	
}

public static String hello() {
	String s= "Hello Java";
			return s;
}
}
