package °úÁ¦7;

public class Dog {
	private String name;
	static String breed;
	private int age;

	public void Dog(String n1, int a1) {
		name = n1;
		age = a1;

	}

	public void Dog(String n2, String b2, int a2) {
		name = n2;
		breed = b2;
		age = a2;
	}

	public void print() {
		System.out.println(name + ", " + breed + ", " + age + "¼¼");
	}
}
