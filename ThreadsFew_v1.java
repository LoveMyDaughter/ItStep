package ua.itstep.homework;

public class ThreadsFew implements Runnable{

	
	int id = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			setId(getId()+1);
			System.out.println(getId());
		}
	}
	
	
	

}
