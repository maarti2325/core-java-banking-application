package edu;

import java.util.*;

public class Gets {

	public static void main(String[] args) {

		ArrayList<Sets> al = new ArrayList<>();
		String name;
		String age;

		int ch;
		Scanner sc = new Scanner(System.in);
//		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to display student");
			System.out.println("Press 3 to exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.next();

				Sets s = new Sets();
				//s.setAge(age);
			//	s.setName(name);
				s.fix(name, age);

				al.add(s);
				System.out.println("Student record added");
				break;
			case 2:
				for (int i = 0; i < al.size(); i++) {
					System.out.println("Student record" + (i + 1));
					//System.out.println("Student name:" + al.get(i).getName());
					//System.out.println("Student age:" + al.get(i).getAge());
					System.out.println("detail is"+al.get(i).fix());
				}
				break;
			case 3:
				System.exit(0);

			default:
				System.out.println("Invalid choice!!! Please make a valid choice");

			}
		}
	//}

}
