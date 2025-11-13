package tests.exams.internal._2022_03_29.question4;

public class BB extends AA {
	
	private int num;

	public BB() {
		super();
		this.num = 1;
	}
	public BB(int num, String st) {
		super(st);
		this.num = Math.abs(num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return super.toString() + " num = " + this.num;
	}
	/**
	 * Section 2 answer.
	 */
	@Override
	public boolean isLike(Object obj) {
		boolean result = false;
		
		if (obj instanceof BB && ((BB) obj).getNum() == this.num)
			result = true;
		
		return result;
	}
}