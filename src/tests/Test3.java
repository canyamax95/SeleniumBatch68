package tests;

public class Test3 {
	static Test3 t3= new Test3();
	static Test1 t1= new Test1();

	public static void main(String[] args) {
		
               red();
               t3.blue();
               Test1.printMe();
               t1.testMe();
               

		//1. create static method -red
		
		//2. create non static method- blue
		
		// 3. call red
		
		//4. call blue
		
		//5. call red in test 1
		
		//6. call blue in test 1
		
		//7. call printMe() - static from Test1
		
		//8. call testme() - non static from Test1
	}
	
	public static void red() {
		System.out.println("red");
	}
public void blue() {
	System.out.println("blue");
}
}
