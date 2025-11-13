package tests.exams.internal._2022_03_29.question3.section3;

public class A {

	private int x;
	
	public A() {
		this.x = 3;
	}
	public A(int x) {
		this.x = x;
		System.out.println(this);
	}
	public int getX() {
		return x;
	}
	public void f() {
		if(x % 2 == 0)
			System.out.println("Even");
		
		System.out.println("In A's f");
		g();
	}
	public void g() {
		System.out.println("In A's g");
	}
	public String toString() {
		return "X: " + this.x;
	}
}