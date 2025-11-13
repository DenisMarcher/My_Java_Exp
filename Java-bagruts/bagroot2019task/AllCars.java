package bagroot2019;

public class AllCars {
	public Car cars[];
	public static int num;
	
	public AllCars(int max) {
		this.cars = new Car[max];
		this.num = 0;
	}
	
	public boolean addCar(Car car) {
		for(int i = 0;i<cars.length;i++) {
			if(cars[i]==null) {
				cars[i] = car;
				num++;
				return true;
			}
		}
		return false;
		
	}
	
	public void print(int min, int max) {
		for(int i = 0;i<num;i++) {
			if(cars[i].getPrice()>min && cars[i].getPrice()<max) {
				System.out.println(cars[i].getLicenseNum());
			}
		}
	}
		
		
	
}
