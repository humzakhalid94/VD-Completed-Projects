package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Integer> digits = new ArrayList<Integer>();

		digits.add(1);
		digits.add(2);
		digits.add(3);
		digits.add(4);
		digits.add(5);
		digits.add(6);
		digits.add(7);
		digits.add(8);
		digits.add(9);
		digits.add(10);
		digits.add(9);
		digits.add(1);
		digits.add(2);
		digits.add(3);
		digits.add(4);
		digits.add(5);
		digits.add(6);
		digits.add(7);
		digits.add(8);
		digits.add(9);
		digits.add(10);
		digits.add(9);
		// We can calulate frequency of items by using this function
		// ******* Collections.frequency(digits, 1) *********

		System.out.println("\nFrequency of List Items Using ArrayList");
		// By using (digits)list here will be a problem , since it contains
		// repeated items and it will iterate to repeated elements too
		for (Integer temp : digits) {
			System.out.println(temp + ": "
					+ Collections.frequency(digits, temp));
		}

		// So more better Approach is Using Sets because it does not contain
		// repeated items
		System.out.println("\nFrequency of List Items Using Set");
		Set<Integer> uniqueSet = new HashSet<Integer>(digits);
		for (Integer temp : uniqueSet) {
			System.out.println(temp + ": "
					+ Collections.frequency(digits, temp));
		}



	}
}
