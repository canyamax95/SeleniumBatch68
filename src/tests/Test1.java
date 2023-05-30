package tests;

import selenium.Test4;

public class Test1 {

	//ClassName objName = new ClassName();
		static Test1 t1 = new Test1();
        static Test2 t2= new Test2();
        static Test3 t3=new Test3();
        static Test4 t4=new Test4();

		public static void main(String[] args) {
			//Test1 t1 = new Test1();
			System.out.println("I'm in main method");
			Test1.scanMe();
			printMe();
			System.out.println("after PrintMe");
			t1.testMe();
			t1.paintMe();
			Test2.circle();
			t2.square();
			Test3.red();
			t3.blue();
			Test4.car();
			t4.train();

		}
		
		public static void printMe() {
			System.out.println("printMe");
		}
		
		public static void scanMe() {
			System.out.println("scanMe");
		}
		
		public void testMe() {
			System.out.println("testMe");
		}
		
		public void paintMe() {
			System.out.println("paintMe");
		}


}
