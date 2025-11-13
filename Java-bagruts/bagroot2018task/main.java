package main16;

public class main {
	public static void main(String[] args){
		Time time = new Time(24,60);
		Airport airport = new Airport();
		Flight[] flights = new Flight[2];
		airport.setFlights(flights);
		flights[0] = new Flight("Boeing","Moscow","2222",new Time(10,10));
		flights[1] = new Flight("Sky","Tel Aviv","1111",new Time(12,30));
		System.out.println(airport.isFly());







	}

}
 