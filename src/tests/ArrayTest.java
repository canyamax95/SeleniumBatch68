package tests;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tools[] = {"Selenium", "Junit", "TestNG", "Testlink", "TestRail"};
		System.out.println(tools.length);
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		
		System.out.println("--------------------------");
		for(int i=0; i<tools.length ; i++) {
			System.out.println(tools[i]);
		}
		
		System.out.println("-------------------------------------");
		int numbers[] = {1,11,235,600,1000};
		System.out.println(numbers.length);
		
		for(int i=0; i<numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-------------------------------------");
		Object mix[] = {"Hello", 10, 30.60};
		System.out.println(mix.length);
		
		/*for(int i=0; i<mix.length ; i++) {
			System.out.println(mix[i]);
		}*/
		
		for(String s : tools) {
			System.out.println(s); // both for loops work same. just different way to write
		}

	

	}

}
