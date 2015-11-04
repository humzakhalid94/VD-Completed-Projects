package pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class VD {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<DataItems> list = new ArrayList<DataItems>();
		DataItems obj1 = new DataItems("A", 1, 1);
		DataItems obj2 = new DataItems("B", 1, 1);
		DataItems obj3 = new DataItems("C", 1, 1);
		DataItems obj4 = new DataItems("D", 1, 1);
		DataItems obj5 = new DataItems("AA", 1, 1);

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj1);
		list.add(obj1);
		list.add(obj3);
		list.add(obj4);

		System.out.println("******* Total Number of Items in List********");
		for (DataItems dataItems : list) {
			System.out.println(dataItems);
		}

		/*
		 * For storing total Objects , As i declared 5 objects of Data Items ,
		 * Therefore it will store 5
		 */
		Set<DataItems> totalObjects = new HashSet<DataItems>();

		// For Storing items that are repeated
		Set<DataItems> repeatedItems = new HashSet<DataItems>();

		// For Storing items that are not repeated
		Set<DataItems> nonrepeatedItems = new HashSet<DataItems>();

		System.out.println("******* ******* *******");

		for (DataItems dataItems : list) {

			if (!totalObjects.add(dataItems)) { // return true if succesfuly
												// added
				repeatedItems.add(dataItems); // return false if duplicate
				// System.out.println("Not Added in totalObjects : " +
				// dataItems);
			}

		}

		nonrepeatedItems = totalObjects;

		System.out.println("******* Total Number of Objects********");
		for (DataItems dataItems : totalObjects) {
			System.out.println(dataItems);
		}

		System.out.println("\n******* Repeated Items ********");
		for (DataItems dataItems : repeatedItems) {
			System.out.println(dataItems);
			nonrepeatedItems.remove(dataItems);
		}

		System.out.println("\n******* Non Repeated Items ********");
		for (DataItems dataItems : nonrepeatedItems) {
			System.out.println(dataItems);

		}

	}
}
