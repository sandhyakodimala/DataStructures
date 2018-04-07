package List;
import java.util.Scanner;

import List.SingleList;

public class DataStructureApplication {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value you want to insert into list");
		SingleList singleList = new SingleList();
		while (scan.hasNext()) {
			singleList.insert(scan.nextInt());
			singleList.traversing();
		}
	}
}
