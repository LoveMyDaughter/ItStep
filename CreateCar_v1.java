package ua.itstep.homework;

public class CreateCar {

	public static void main(String[] args) {

		//new Car();
		Car [] car = new Car[10];
		
		car[0] = new Car("Opel", "Astra", 2005, "Серый", 18000, 347894);		
		car[1] = new Car("Nissan", "Sunny", 1995, "Красный", 2500, 118553);		
		car[2] = new Car("Citroen", "c4", 2009, "Белый", 21500, 747118);
		car[3] = new Car("Merc", "s500", 2012, "Серый", 25000, 988790);
		car[4] = new Car("Fiat", "Doblo", 2013, "Серый", 15000, 143138);
		car[5] = new Car("Hyundai", "Tucson", 2014, "Черный", 11500, 317548);
		car[6] = new Car("Hyundai", "Sonata", 2011, "Черный", 9900, 312548);
		car[7] = new Car("Nissan", "Almera", 2002, "Синий", 3500, 155280);
		car[8] = new Car("Nissan", "Maxima", 2007, "Зеленый", 8000, 581109);
		car[9] = new Car("Merc", "ml500", 2013, "Черный", 21500, 988352);
		
	
		for (Car c: car) {
			// список автомобилей марки Nissan
			if (c.getName() == "Nissan") {
				System.out.println(c.toString());
			}	
		}
		
		//System.out.println(car[0].getName());

	}

}
