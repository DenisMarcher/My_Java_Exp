package tests.exams.internal._2022_03_29.question2.section1;

import utilities.adt.mine.Utilities;
import utilities.adt.moe.Stack;

public class Main {
	
	public  static boolean isThreePali (Stack<Character> s1) {
        Stack<Character> s2 = new Stack<Character>();
        Stack<Character> s3 = new Stack<Character>();
        int count = Utilities.length(s1);
        
        if (count % 3 != 0) return false;
        
        for (int i = 0; i < count / 3; i++) {
            char x = s1.pop();
            s2.push(x);
        }
        
        for (int i = 0; i < count / 3; i++) {
            char a = s1.pop();
            char b = s2.pop();
            
            if (a != b) return false;
            s3.push(a);
        }
        
        for (int i = 0; i < count / 3; i++) {
            char a = s1.pop();
            char b = s3.pop();
            
            if (a != b) return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
		
	}
}