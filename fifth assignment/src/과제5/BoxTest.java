package 과제5;

public class BoxTest {

	public static void main(String[] args) {
		
		Box Box = new Box();
		Box.setWid(10);
		Box.setVer(20);
		Box.setHei(50);
		
		System.out.println("부피 : "+Box.getVolume());
		System.out.println("가로 : " + Box.getWid() + ", 세로 : " + Box.getVer() + ", 높이 : " + Box.getHei());

	}

}
