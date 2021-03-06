package sample;

public class PersonManage {

	String name;
	int age;
	String address;

	// полный конструктор
	public PersonManage(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// короткий конструктор
	public PersonManage(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + address + " ";
	}




}
