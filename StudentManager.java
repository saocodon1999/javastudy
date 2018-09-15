package ontapthcs4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
	public static Scanner scan = new Scanner(System.in);

	/* them sinh vien */
	public ArrayList<Student> studentAdd(ArrayList<Student> arrayListStudent) {
		Student student;
		Birthday birthday;
		System.out.println("\nnhap so sinh vien muon them: ");
		int n = Integer.parseInt(scan.nextLine());
		while(n <=0 ) {
			System.out.println("so sinh vien muon them phai la so nguyen duong, moi ban nhap lai: ");
			n = scan.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			System.out.println("nhap id sinh vien thu: " + i);
			String id = scan.nextLine();
			while (checkIDInput(id) == false) {
				id = scan.nextLine();
			}
			
			if (checkIdIsExistInArrayList(arrayListStudent, id) == true) {

				System.out.println("nhap ten");
				String name = scan.nextLine();

				System.out.println("nhap ngay sinh: ");
				String dateOfBirth = scan.nextLine();

				System.out.println("nhap thang sinh: ");
				String monthOfBirth = scan.nextLine();

				System.out.println("nhap nam sinh: ");
				String yearsOfBirth = scan.nextLine();
				birthday = new Birthday(dateOfBirth, monthOfBirth, yearsOfBirth);
				student = new Student(id, name, birthday);
				arrayListStudent.add(student);
			}
			System.out.println("success! ");
		}
		return arrayListStudent;
	}

	/* kiem tra id ton tai hay khong */
	public boolean checkIdIsExistInArrayList(ArrayList<Student> arrayListStudent, String id) {
		for (int i = 0; i < arrayListStudent.size(); i++) {
			while (arrayListStudent.get(i).getId().equals(id)) {
				System.out.println("id da ton tai, moi ban nhap lai id: ");
				id = scan.nextLine();
			}
		}
		return true;
	}
	// kiem tra id co ky tu hay khong
	public boolean checkIDInput(String id) {
		for (int j = 0; j < id.length(); j++) {
			Character charAtj = id.charAt(j);
			if (Character.isLetter(charAtj) == true) {
				System.out.println("id can not have character, pls input again. i.e : 123456");
				return false;
			}
		}
		return true;
	}

	/* sap xep sinh vien */
	public ArrayList<Student> sortOldOfStudent(ArrayList<Student> arrayListStudent) {
		Collections.sort(arrayListStudent, (o1, o2) -> {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		});
		System.out.println("sorted!");
		return arrayListStudent;
	}

	/* in danh sach sinh vien */
	public void showInfoStudent(ArrayList<Student> arrayListStudent) {
		for (int i = 0; i < arrayListStudent.size(); i++) {
			System.out.println(arrayListStudent.get(i));
		}
	}
}
