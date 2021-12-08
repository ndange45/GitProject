

class Parent{
	void method1() {
		System.out.println("Method1");
	}
	void method2() {
		System.out.println("Method2");
	}
	void method3() {
		System.out.println("Method3");		
	}
}

public class Child extends Parent{
	public static void main(String[]arg) {
		Child c=new Child();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		c.method6();

	}

	void method4() {
		System.out.println("Method4");
	}
	void method5() {
		System.out.println("Method5");
	}
	void method6() {
		System.out.println("method6");
	}
}
