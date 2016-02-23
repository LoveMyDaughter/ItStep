package ua.itstep.work;

public class StartPerson {

	public static void main(String[] args) {

		PersonLogic lg = new PersonLogic();
		
		lg.addPerson("Anton", 29, "Ukraine,Rivne");
		lg.addPerson("Anna", 31, "Ukraine,Lviv");
		lg.addPerson("Yakov", 46, "USA,NewYork");
		lg.addPerson("Mariana", 30, "England,London");
		
		lg.showPerson();
		
		lg.delPerson(1);
		
		System.out.println();
		lg.showPerson();

	}

}
