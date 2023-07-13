package test.item18;

public class ClassTest {
	public static void main(String[] args) {
		C c = new C();
		c.sayHi();
	}
}
abstract class A {
	public void sayHi(){
		System.out.println("AAAAAA");
	}
	public void sayHello(){
		System.out.println("IaM A");
		sayHi();
	}
}

class B extends A {
	public void sayHi(){
		System.out.println("BBBBBB");
	}
//	public void sayHello(){
//		System.out.println("IAM B");
//	}
}

class C extends B {
	public void sayHi(){
		System.out.println("CCCCCCC");
		super.sayHello();
	}
	public void sayHello(){
		System.out.println("IAM C");
	}
}
