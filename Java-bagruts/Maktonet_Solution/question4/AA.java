package tests.exams.internal._2022_03_29.question4;

public class AA {

	private String st;
	
	public AA() {
		this.st = "excellent";
	}
	public AA(String st) {
		this.st = st;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "st = " + this.st;
	}
	/**
	 * Section 1 answer.
	 * @param obj
	 * @return
	 */
	public boolean isLike(Object obj) {
		boolean result = false;
		
		if (obj instanceof AA && ((AA) obj).getSt().equals(this.st))
			result = true;;
		
		return result;
	}
}