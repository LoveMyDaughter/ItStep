package sample;

import java.util.ArrayList;

public class PersonLogic {

    ArrayList<PersonManage> personList = new ArrayList<>();

    // метод додавання персони
    public void addPerson(String n, int a, String addr) {
        personList.add(new PersonManage(n, a, addr));
    }
    // метод додавання персони СКОРОЧЕНИЙ
    public void addPerson(String n) {
        personList.add(new PersonManage(n));
    }

    // метод видалення персони
    public void delPerson(int pos) {
        personList.remove(pos);
    }

    // метод ПОКАЗ персон
    public void showPerson(){
        for (PersonManage c : personList) {
            System.out.println(c);
        }
    }

}
