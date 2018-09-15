package ontapthcs4;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
	/* lua chon chuc nang */
	public void optionalFunction(ArrayList<Student> arrayListStudent) throws Exception {
		StudentManager studentManager = new StudentManager();
		Scanner scan = new Scanner(System.in);
		System.out.println("moi ban chon chuc nang: ");
		System.out.println("====================================MENU====================================");
		System.out.println("1: them sinh vien");
		System.out.println("2: sap xep sinh vien theo ten");
		System.out.println("3: Hien thi sinh vien ra man hinh");
		System.out.println("4: Exit");
		int key = Integer.parseInt(scan.nextLine());
		while (key <= 0 || key > 4) {
			System.out.println("key is between of 1 and 4, please enter again! ");
			key = scan.nextInt();
		}
		while (key != 4) {
			switch (key) {
			case 1:
				System.out.println("ban da chon chuc nang them sinh vien");
				studentManager.studentAdd(arrayListStudent);
				System.out.println("chon chuc nang khac");
				key = Integer.parseInt(scan.nextLine());
				while (key <= 0 || key > 4) {
					System.out.println("key is between of 1 and 4, please enter again! ");
					key = scan.nextInt();
				}
				break;
			case 2:
				System.out.println("ban da chon chuc nang sap xep sinh vien theo ten!");
				studentManager.sortOldOfStudent(arrayListStudent);
				System.out.println("chon chuc nang khac");
				key = Integer.parseInt(scan.nextLine());
				while (key <= 0 || key > 4) {
					System.out.println("key is between of 1 and 4, please enter again! ");
					key = scan.nextInt();
				}
				break;
			case 3:
				System.out.println(
						"ban da chon chuc nang hien thi sinh vien ra man hinh, day la danh sach sinh vien cua ban: ");
				studentManager.showInfoStudent(arrayListStudent);
				System.out.println("chon chuc nang khac: ");
				key = Integer.parseInt(scan.nextLine());
				while (key <= 0 || key > 4) {
					System.out.println("key is between of 1 and 4, please enter again! ");
					key = scan.nextInt();
				}
				break;
			}
		}
	}
}
