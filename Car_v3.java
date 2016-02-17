package ua.itstep.homework;



public class Car {

	static int id;
	private int CarId;   

	private int year;
    private int price;
    private int regNumber;
    private String name;
    private String model;
    private String color;

    Car(String name, String model, int year, String color, int price, int regNumber){    	
    	setId(id+1);
    	setCarId(Car.getId());
    	setName(name);
    	//System.out.println("Марка: " + getName());
    	setModel(model);
    	//System.out.println("Модель: " + getModel());
    	setYear(year);
    	//System.out.println("Год выпуска: " + getYear());
    	setColor(color);
    	//System.out.println("Цвет: " + getColor());
    	setPrice(price);
    	//System.out.println("Цена: " + getPrice());
    	setRegNumber(regNumber);
    	//System.out.println("Рег. номер: " + getYear());    	
    	
    	System.out.println(toString());
    }   
    
    
    public static int getId() {
		return id;
	}

	public void setId(int id) {
		Car.id = id;
	}
	 
	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		
	public String toString() {
		return getCarId() + "\t" + getName() + "\t" + getModel() + "\t" + getYear() + "\t" + getColor() + "\t" + getPrice() + "\t" + getRegNumber();
	}
	
   

}
