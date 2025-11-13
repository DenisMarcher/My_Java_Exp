package bagroot2019;

public class Targil_4 {
	public static boolean secret1 (int num,int digit) {
		if(num<10) {return(num%2==digit%2);}
		if(num%2 !=digit%2) {return false;}
		return secret1(num/10,digit);
		
	}
	// 1) display true
	// 2) example of the numbers 1)num =2,digit = 5  2)num = 4,digit = 5  3) num = 6, digit = 5 
	// 3) This function displays false if the number is not a multiple to digit. Displays true if number a multiple to digit.
}
