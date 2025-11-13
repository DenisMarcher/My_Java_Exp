package tests.exams.internal._2022_03_29.question3.section3;

public class B extends A {

	private int y;
	
	public B() {
		super(4);
		y = getX() + 2;
	}
	public B(int y) {
		super();
		this.y = y;
		System.out.println(toString());
	}
	public void h() {
		System.out.println("in B's h");
	}
	public void f() {
		System.out.println("in B's f");
		g();
		h();
	}
	public String toString() {
		return super.toString() + " Y: " + y;
	}
}