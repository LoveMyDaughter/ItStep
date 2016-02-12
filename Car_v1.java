package ua.itstep.homework;


public class Car {

	static int id;
    private int year;
    private int price;
    private int regNumber;
    private String name;
    private String model;
    private String color;

    Car(String name, String model, int year, String color, int price, int regNumber){    	
    	setId(id);
    	setName(name);
    	//System.out.println("�����: " + getName());
    	setModel(model);
    	//System.out.println("������: " + getModel());
    	setYear(year);
    	//System.out.println("��� �������: " + getYear());
    	setColor(color);
    	//System.out.println("����: " + getColor());
    	setPrice(price);
    	//System.out.println("����: " + getPrice());
    	setRegNumber(regNumber);
    	//System.out.println("���. �����: " + getYear());    	
    	
    	System.out.println(toString());
    }   
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		Car.id = id+1;
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
		return getId() + "\t" + getName() + "\t" + getModel() + "\t" + getYear() + "\t" + getColor() + "\t" + getPrice() + "\t" + getRegNumber();
	}
	
   

}
