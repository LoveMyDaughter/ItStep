package ua.itstep.work;

import java.util.ArrayList;

public class PersonLogic {
	
	ArrayList<PersonManage> personList = new ArrayList<>();
	
	// ����� ��������� �������
		public void addPerson(String n, int a, String addr) {						
			personList.add(new PersonManage(n, a, addr));			
		}
		
		// ����� ��������� �������
		public void delPerson(int pos) {				
			personList.remove(pos);			
		}
		
		// ����� ����� ������
		public void showPerson(){		
			for (PersonManage c : personList) {
				System.out.println(c);
			}
		}	

}
