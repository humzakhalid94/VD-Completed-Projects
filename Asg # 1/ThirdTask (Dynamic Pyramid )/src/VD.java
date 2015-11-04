import java.util.Scanner;

public class VD {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Just change the number of Rows , It will adjust Automatically ,
		// Currently
		// You can view * (Stars)

		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter the String value ");
		String stringvalue = scaner.nextLine();
		StringBuilder builder = new StringBuilder();
		builder.append("Number of rows : ");
		builder.append(stringvalue);
		System.out.println(builder);
		int row = Integer.parseInt(stringvalue);

		for (int i = row; i > 0; i--) {

			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int r = row - i; r >= 0; r--) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// Just change the number of Rows , It will adjust Automatically ,
		// Currently
		// now it display number

		System.out.println("\n Views in Number");

		int row2 = 4;
		int incr2 = 1;
		for (int i2 = row2; i2 > 0; i2--) {

			for (int j2 = i2; j2 > 0; j2--) {
				System.out.print(" ");
			}
			for (int r2 = row2 - i2; r2 >= 0; r2--) {
				System.out.print((incr2++) + " ");
			}

			System.out.println();
		}

	}

}
