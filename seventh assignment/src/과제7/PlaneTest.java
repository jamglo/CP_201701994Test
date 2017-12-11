package 과제7;

public class PlaneTest {

	public static void main(String[] args) {

		Plane plane1 = new Plane();
		Plane plane2 = new Plane();
		
		System.out.println(plane1.getCom()+", "+plane1.getMod()+", "+plane1.getNumber());
		
		plane2.setPlane("아시", 880);
		System.out.println(plane2.getCom()+", "+plane2.getMod()+", "+plane2.getNumber());
		
		System.out.println("비행기의 수 : "+Plane.getPlanes());
	}

}
