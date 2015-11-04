package defalut;

public class ThreadInterface implements Runnable {
	String Th_name;

	public ThreadInterface(String th_name) {

		Th_name = th_name;
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub

		// sleep(100);

		for (int i = 0; i < 10; i++) {

			if (i < 5)
				System.out.println("Thread Name : " + Th_name
						+ " , Iteration # " + i);
			else if (i == 5) {

				System.out.println("Thread Name : " + Th_name
						+ " , Iteration # " + i);
				System.out.println("Before Sleep ");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				// sleep();

				System.out.println("After Sleep ");
			} else if (i > 5)
				System.out.println("Thread Name : " + Th_name
						+ " , Iteration # " + i);

		}

	}

}
