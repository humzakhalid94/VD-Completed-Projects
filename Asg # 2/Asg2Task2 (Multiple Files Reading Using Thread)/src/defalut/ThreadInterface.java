package defalut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadInterface implements Runnable {
	String Th_name;
	String filePath;

	public ThreadInterface(String th_name , String path) {

		Th_name = th_name;
		filePath = path;
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub

		// sleep(100);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					filePath));

			String line;

			while ((line = reader.readLine()) != null) {
				StringBuilder builder = new StringBuilder();
				builder.append("\nThread : ");
				builder.append(Th_name);
				builder.append(": \t");
				builder.append("File Content :");
				builder.append(line);
				System.out.println(builder);

			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			StringBuilder builder = new StringBuilder();
			builder.append("Following File not found ");
			builder.append(filePath );
			builder.append(" , on Thread " );
			builder.append( Th_name);
			System.out.println(  builder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
