package main16;

public class Airport {

	public Flight flights[];

	public boolean isFly(){
		for (int i = 0; i < this.flights.length; i++) {
			if (this.flights[i].getName().equals("Sky")) return true;
		}
		return false;
	}

	public void setFlights (Flight[] flights) {
		this.flights = flights;
	}
	
}
