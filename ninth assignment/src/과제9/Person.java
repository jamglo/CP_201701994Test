package °úÁ¦9;

public class Person {
	String name, add, num;

	public Person() {
	}

	public Person(String name, String add, String num) {
		this.name = name;
		this.add = add;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}

class Customer extends Person {
	String cus_num;
	int mile;

	public Customer() {
	}

	public Customer(String cus_num, int mile) {
		super();
		this.cus_num = cus_num;
		this.mile = mile;
	}
}
