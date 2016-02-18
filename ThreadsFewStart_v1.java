package ua.itstep.homework;

public class ThreadsFewStart {

	public static void main(String[] args) {

		ThreadsFew firstThread = new ThreadsFew();
		ThreadsFew secondThread = new ThreadsFew();
		ThreadsFew thirdThread = new ThreadsFew();

		
		new Thread (new Runnable() {

			@Override
			public void run() {
				firstThread.run();				
			}
			
		}).start();
		
		
	

	}
	


}
