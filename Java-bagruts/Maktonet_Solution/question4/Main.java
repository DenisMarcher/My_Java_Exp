package tests.exams.internal._2022_03_29.question4;

public class Main {
	public static void main(String[] args) {
//		section3();
		section5();
	}
	/**
	 * This code is correct and would print:
	 * st = excellent num = 1
	 * calling 'isLike' defined in class BB.
	 */
	public static void section3() {
		AA a = new AA("excellent");
		BB b = new BB();
		a = b;
		
		if (a.isLike(b))
			System.out.println(a);
	}
	/**
	 * This code contains a compilation error:
	 * Type mismatch: cannot convert from AA to BB
	 */
	public static void section4() {
		AA aa = new AA();
		BB bb = new BB(2, "excellent");
		bb = aa;
		
		if (bb.isLike(aa))
			System.out.println(bb);
	}
	public static void section5() {
		Object[] objects = createData();
		String theString = longString(objects);
		
		System.out.println("Printing the long string:");
		System.out.println(theString);
	}
	private static Object[] createData() {
		Object[] objects = new Object[5];
		
		objects[0] = new BB(2, null);
		objects[1] = new Object();
		objects[2] = new AA("third");
		objects[3] = new AA("fourth");
		objects[4] = new Object();
		
		return objects;
	}
	public static String longString(Object[] objects) {
		String result = "";
		
		if (objects == null) return result;
		
		for (int q = 0; q < objects.length; q++) {
			if (objects[q] != null) {
				int repetitions = 1;
				if (objects[q] instanceof BB)
					repetitions = ((BB) objects[q]).getNum();
				if (objects[q] instanceof AA)
					for (int w = 0; w < repetitions; w++)
						result += ((AA) objects[q]).getSt();
			}
		}
		
		return result;
	}
}