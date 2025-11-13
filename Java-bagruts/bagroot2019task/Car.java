package bagroot2019;

public class Car {
	private String licenseNum;
	private boolean hadAccident;
	private int price;
	
	public Car(String licenseNum, boolean hadAccident, int price) {
		setLicenseNum(licenseNum);
		setHadAccident(hadAccident);
		setPrice(price);
		
	}
		
    public String getLicenseNum () {
        return licenseNum;
    }

    public void setLicenseNum (String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public boolean isHadAccident () {
        return hadAccident;
    }

    public void setHadAccident (boolean hadAccident) {
        this.hadAccident = hadAccident;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }
	
    
    public boolean range(int min,int max) {
    	if(price>min && price<max) return true;
    	else return false;
    }
	
	

}
