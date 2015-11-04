package defalut;

public class VD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread mainThread;
		ThreadInterface runnable1 = new ThreadInterface("t1");
		ThreadInterface runnable2 = new ThreadInterface("t2");
		ThreadInterface runnable3 = new ThreadInterface("t3");
		
		
		
		mainThread = new Thread(runnable1);
		mainThread.start();
		
		
		mainThread = new Thread(runnable2);
		mainThread.start();
		
		mainThread = new Thread(runnable3);
		mainThread.start();
		
		
	}

}
