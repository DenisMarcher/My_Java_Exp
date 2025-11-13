package tests.exams.internal._2022_03_29.question3.section3;

public class Main {
	public static void main(String[] args) {
		runCodeBlocks();
	}

	private static void runCodeBlocks() {
//		block1();
//		block2();
//		block3();
//		block4();
//		block5();
//		block6();
	}
	/**
	 * Code is correct:</br>
	 * 	<code>
	 * 		In A's f</br>
	 * 		In A's g
	 * 	</code>
	 */
	private static void block1() {
		A a1 = new A();
		a1.f();
	}
	/**
	 * Code has compilation error:</br>
	 * 	The method h() is undefined for the type A
	 */
//	private static void block2() {
//		A a2 = new B(5);
//		a2.h();
//	}
	/**
	 * Code is correct:</br>
	 * 	<code>
	 * 		X: 3 Y: 2</br>
	 * 		in B's f</br>
	 * 		In A's g</br>
	 * 		in B's h
	 * 	</code>
	 */
	private static void block3() {
		A a3 = new B(2);
		B b1 = (B)a3;
		b1.f();
	}
	/**
	 * Code is correct:</br>
	 * 	<code>
	 * 		X: 4 Y: 0</br>
	 * 		in B's f</br>
	 * 		In A's g</br>
	 * 		in B's h</br>
	 * 		X: 4 Y: 6
	 * 	</code>
	 */
	private static void block4() {
		A a4 = new B();
		a4.f();
		System.out.println(a4.toString());	
	}
	/**
	 * Code has a runtime exception:</br>
	 * 	class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
	 */
	private static void block5() {
		B b2 = (B)(new A(6));
		System.out.println(b2.toString());	
	}
	/**
	 * Code has a compilation error:</br>
	 * 	Type mismatch: cannot convert from A to B
	 */
//	private static void block6() {
//		B b3 = (A)(new B());
//		System.out.println(b3.toString());	
//	}
}