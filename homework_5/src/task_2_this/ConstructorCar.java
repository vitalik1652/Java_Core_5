package task_2_this;

public class ConstructorCar {
	private String brand, model, color;
	private int years;

	ConstructorCar() {
		return;
	}

	ConstructorCar(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	ConstructorCar(String brand, String model, String color, int years) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.years = years;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "ConstructorCar: [brand = " + brand + ", model = " + model + ", "
				+ "color = " + color + ", years = " + years + "]";
	}

}
