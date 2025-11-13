package main16;

public class Flight {
	private String name;
	private String destination;
	private String flightCode;
	private Time flightTime;
	
	public Flight(String name, String destination, String flightCode, Time flightTime){
		setName(name);
		setDestination(destination);
		setFlightCode(flightCode);
		setFlightTime(flightTime);
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public void setFlightTime(Time flightTime) {
		this.flightTime = flightTime;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDestination() {
		return destination;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public Time getFlightTime() {
		return flightTime;
	}
	public String getName() {
		return name;
	}

}
