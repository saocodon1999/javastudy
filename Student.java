package ontapthcs4;

public class Student {

	private String id;
	private String name;
	private Birthday birthday;

	public Student(String id, String name, Birthday birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Birthday getBirthday() {
		return birthday;
	}

	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {

		return getId() + " " + getName() + " " + getBirthday().getDateOfBirth() + "/" + getBirthday().getMonthOfBirth()
				+ "/" + getBirthday().getYearsOfBirth();

	}
}
