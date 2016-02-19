import java.util.concurrent.TimeUnit;

public class ThreadsFew implements Runnable{

	
	private int id = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			setId(getId()+1);
			System.out.println(getId());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
