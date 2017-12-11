package 과제7;

public class DogTest {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.Dog("호두", 1);
		dog1.print();
		
		Dog dog2 = new Dog();
		dog2.Dog("마루", "시바 이누", 4);
		dog2.print();
	}

}
