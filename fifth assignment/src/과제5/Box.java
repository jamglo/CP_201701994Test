package 과제5;

public class Box {

	int wid;
	int ver;
	int hei;

	public void setWid(int w) {
		wid = w;
	}

	public void setVer(int v) {
		ver = v;
	}

	public void setHei(int h) {
		hei = h;
	}

	public int getWid() {
		return wid;
	}

	public int getVer() {
		return ver;
	}

	public int getHei() {
		return hei;
	}

	public int getVolume() {
		int volume = wid * hei * ver;
		return volume;
	}

	public void print() {
		System.out.println("가로 : " + wid + "세로 : " + ver + "높이 : " + hei);
	}
}
