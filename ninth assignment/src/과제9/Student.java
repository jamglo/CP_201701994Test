package 과제9;

public class Student {
	String name, maj;
	int num, gra, sco;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMaj() {
		return maj;
	}

	public void setMaj(String maj) {
		this.maj = maj;
	}

	public int getGra() {
		return gra;
	}

	public void setGra(int gra) {
		this.gra = gra;
	}

	public int getSco() {
		return sco;
	}

	public void setSco(int sco) {
		this.sco = sco;
	}
}

class UnderGraduate extends Student {
	String club;

	public UnderGraduate(String name, int num, String maj, int gra, int sco, String club) {
		this.name = name;
		this.num = num;
		this.maj = maj;
		this.gra = gra;
		this.sco = sco;
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String toString() {
		return getName() + ", " + getNum() + ", " + getMaj() + ", " + getGra() + ", " + getSco() + ", " + getClub();
	}
}

class Graduate extends Student {
	boolean assi;
	double scho;

	public String getAssi() {
		if (assi == true)
			return "교육조교";
		else
			return "연구조교";
	}

	public void setAssi(boolean assi) {
		this.assi = assi;
	}

	public double getScho() {
		return scho;
	}

	public void setScho(double scho) {
		this.scho = scho;
	}

	public Graduate(String name, int num, String maj, int gra, int sco, boolean assi, double scho) {
		this.name = name;
		this.num = num;
		this.maj = maj;
		this.gra = gra;
		this.sco = sco;
		this.assi = assi;
		this.scho = scho;
	}

	public String toString() {
		return getName() + ", " + getNum() + ", " + getMaj() + ", " + getGra() + ", " + getSco() + ", " + getAssi()
				+ ", " + getScho();
	}
}