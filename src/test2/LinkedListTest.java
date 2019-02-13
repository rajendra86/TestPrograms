package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Program to create, insert and traverse a linked list

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		List<Integer> linkedList = new ArrayList<Integer>();
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		int choice = 1,no, loc;

		do {
			System.out.println("\n1) Insert at front");
			System.out.println("2) Insert at rear");
			System.out.println("3) Insert at a specific position");
			System.out.println("4) Remove an element");
			System.out.println("5) Remove at a specific position");
			System.out.println("6) Display");
			System.out.println("7) Exit");

			System.out.print("Enter your choice:-> ");
			choice = Integer.parseInt(y.readLine());

			switch (choice) {
			case 1:
				System.out.println("Inserting at front");
				System.out.print("Enter a no:-> ");
				no = Integer.parseInt(y.readLine());
				linkedList.add(0, no);
				break;
			case 2:
				System.out.println("Inserting at rear");
				System.out.print("Enter a no:-> ");
				no = Integer.parseInt(y.readLine());
				linkedList.add(no);
				break;
			case 3:
				System.out.println("Inserting at a specific location");
				System.out.print("Enter a no:-> ");
				no = Integer.parseInt(y.readLine());
				System.out.print("Enter the location:-> ");
				loc = Integer.parseInt(y.readLine());
				linkedList.add(loc,no);
				break;
			case 4:
				System.out.println("Removing an Element");
				System.out.print("Enter an element:-> ");
				no = Integer.parseInt(y.readLine());
				if(linkedList.contains(no)){
					linkedList.remove((Integer)no);
				} else {
					System.out.println("Entered element doesnot exist!!!");
				}
				break;
			case 5:
				System.out.println("Removing an Element at a specific location");				
				System.out.print("Enter the location:-> ");
				loc = Integer.parseInt(y.readLine());
				linkedList.remove(loc);
				break;
			case 6:
				System.out.println("Displaying the contents ");
				for (int i = 0; i < linkedList.size(); i++) {
					System.out.print("LinkedList[" + i + "] :-> ");
					System.out.print(linkedList.get(i) +"\n");
				}
				break;
			case 7:
				System.out.println("Exiting!!!");
				choice = 0;
				break;
			default:
				System.out.println("Invalid Option!!!");
				choice = 0;
			}
		} while (choice != 0);

	}
}
