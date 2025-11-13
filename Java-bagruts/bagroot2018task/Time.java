package main16;
public class Time {
	private int hour;
	private int minute;
	
	
	public Time(int hour,int minute) {
		setHour(hour);
		setMinute(minute);
	}
	

	public void setMinute(int minute) {
		if (minute<0||minute>60){
			System.out.println("Invalid minute");
			this.minute = 0;
		}else this.minute = minute;
	}
	public void setHour(int hour) {
		if(hour < 0||hour>24){
			System.out.println("Invalid hour");
			this.hour = 0;
		}else this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public int getHour() {
		return hour;
	}
	

}
