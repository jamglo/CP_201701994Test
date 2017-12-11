package 과제7;

public class Plane {
	private String com, mod;
	private int number;
	private static int planes = 0;
	

	public String getCom() {
		return com;
	}

	public String getMod() {
		return mod;
	}

	public int getNumber() {
		return this.number;
	}
	
	public static int getPlanes() {
		return planes;
	}

	public void setPlane(String m, int n){
		this.mod = m;
		this.number = n;
	}
	
	public Plane(){
		this.com = "에어버스";
		this.mod = "A380";
		this.number = 500;
		planes++;
	}
}
