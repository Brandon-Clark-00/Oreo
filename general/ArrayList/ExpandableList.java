import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Brandon
 *
 */
public class ExpandableList {

	static Scanner input = new Scanner(System.in);
	private ArrayList<String> testList = new ArrayList<String>(0);
	private int aLength;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpandableList list1 = new ExpandableList();
		list1.menuChoice();
	}

	static String getString() {
		String iPut;
		iPut = input.next();
		if (iPut.equals("")) {
			getString();
		}
		return iPut;
	}

	static int getInt() {
		int iPut;
		iPut = input.nextInt();
		return iPut;
	}

	void displayMenu() {
		System.out.println("ArrayLists");
		System.out.println("Choose an option");
		System.out.println("1. Add to list");
		System.out.println("2. Add at point in list");
		System.out.println("3. Remove from end of list");
		System.out.println("4. Remove from list at point");
		System.out.println("5. View full list");
		System.out.println("6. View one index");
		System.out.println("7. Get length of list");
		System.out.println("8. Clear list");
		System.out.println("9. Exit");

	}

	void menuChoice() {
		int choice = 15;
		while (choice != 9) {
			displayMenu();
			choice = getInt();
			switch (choice) {

			case 1:
				System.out.println("Enter input");
				addToList();
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 2:
				System.out.println("Enter a string and then enter what position you want it at");
				addAtPoint(getString(), getInt());
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 3:
				deleteEnd();
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 4:
				deleteIndex();
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 5:
				viewList();
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 6:
				viewIndex();
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 7:
				System.out.println("Length: " + getaLength());
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 8:
				testList.clear();
				System.out.println("List cleared");
				System.out.println("");
				System.out.println("==========================================");
				break;
			case 9:
				System.out.println("Exiting");
				System.exit(0);
			}
			if (choice < 0 || choice > 8) {
				System.out.println("Invalid, please chose something else.");
				menuChoice();
			}
		}
	}

	void addToList() {
		String temp = getString();
		testList.add(temp);
		System.out.println("Added " + testList.get(testList.size() - 1) + " to the list");

	}

	void addAtPoint(String input, int index) {
		System.out.println("");
		try {
			testList.add(index, input);

			System.out.println("'" + testList.get(index) + "' added at position " + index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
			addAtPoint(getString(), getInt());
		}

	}

	void deleteEnd() {
		try {
			testList.remove(testList.size() - 1);
			System.out.println("Item removed");

		} catch (IndexOutOfBoundsException e) {
			System.out.println("No items in the array");

		}
	}

	void deleteIndex() {
		System.out.println("Enter index");
		int index = getInt();

		try {
			testList.remove(index);
			System.out.println("Item removed");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No item with that index");
		}
	}

	void viewList() {
		for (int i = 0; i < testList.size(); i++) {
			if (i == testList.size() - 1) {
				System.out.print(testList.get(i));
			} else {
				System.out.print(testList.get(i) + ", ");
			}

		}
		System.out.println("");
	}

	void viewIndex() {
		try {
			System.out.println("Enter index: ");
			int index = getInt();
			System.out.println(testList.get(index));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index not in array");
		}

	}

	/**
	 * @return the testList
	 */
	public ArrayList<String> getTestList() {
		return testList;
	}

	/**
	 * @param testList the testList to set
	 */
	public void setTestList(ArrayList<String> testList) {
		this.testList = testList;
	}

	/**
	 * @return the aLength
	 */
	public int getaLength() {
		return aLength;
	}

	/**
	 * @param aLength the aLength to set
	 */
	public void setaLength() {
		this.aLength = testList.size();
	}

}
