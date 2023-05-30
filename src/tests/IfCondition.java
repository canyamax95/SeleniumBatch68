package tests;

public class IfCondition {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		if(a==b) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
		
		String expcted = "Hello World";
		String actual = "Hello world";
		
		if(expcted.equals(actual)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

	}

}
