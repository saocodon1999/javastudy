package ontapthcs4;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> arrayListStudent = new ArrayList<Student>();
		Function function = new Function();
		try {
			function.optionalFunction(arrayListStudent);
		} catch (Exception e) {
			new ErrorInputStudent();
		}
	}
}
