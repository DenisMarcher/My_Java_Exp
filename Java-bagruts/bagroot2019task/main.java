package bagroot2019;

public class main {
	public static void main(String[] args) {
		
		Car mercedes = new Car("Mercedes", false, 500);
		Car bmw = new Car("BMW",false,200);
		AllCars allCars = new AllCars(6);
		allCars.addCar(mercedes);
		allCars.addCar(bmw);
		allCars.print(0, 600);
		
		
	

		
		
		
		
		
	}
	
	
}
