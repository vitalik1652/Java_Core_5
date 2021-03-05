package task_2_this;

public class Constructor2 extends ConstructorCar {
	private String nameDriver;
	private int ageDriver;
	private double wallet;

//	Constructor2(String brand, String model, String color, int years, String nameDriver, int ageDriver, int wallet) {
//		super(brand, model, color, years);
//		this.nameDriver = nameDriver;
//		this.ageDriver = ageDriver;
//		this.wallet = wallet;
//	}

	Constructor2(ConstructorCar constructorCar, String nameDriver, int ageDriver, int wallet) {
		super();
		this.nameDriver = nameDriver;
		this.ageDriver = ageDriver;
		this.wallet = wallet;
	}

	Constructor2(String nameDriver, int ageDriver, double wallet) {
		super("BMW", "4 series", "red", 2018);
		this.nameDriver = nameDriver;
		this.ageDriver = ageDriver;
		this.wallet = wallet;
	}

	public String getNameDriver() {
		return nameDriver;
	}

	public void setNameDriver(String nameDriver) {
		this.nameDriver = nameDriver;
	}

	public int getAgeDriver() {
		return ageDriver;
	}

	public void setAgeDriver(int ageDriver) {
		this.ageDriver = ageDriver;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Constructor2: [nameDriver = " + nameDriver + ", ageDriver = " + ageDriver + ", wallet = " + wallet
				+ "] toString() = " + super.toString();
	}

}
