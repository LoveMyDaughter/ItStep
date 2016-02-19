

public class ThreadsFewStart {

	public static void main(String[] args) {

		ThreadsFew firstThread = new ThreadsFew();
		ThreadsFew secondThread = new ThreadsFew();
		ThreadsFew thirdThread = new ThreadsFew();
		
		(new Thread (firstThread)).start();
		Thread.currentThread().setPriority(2);
				
		(new Thread (secondThread)).start();
		Thread.currentThread().setPriority(5);
		
		(new Thread (thirdThread)).start();
		Thread.currentThread().setPriority(7);
		
		

	}
	


}
