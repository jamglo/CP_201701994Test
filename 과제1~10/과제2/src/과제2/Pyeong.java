package 과제2;

import java.util.Scanner;

public class Pyeong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pyeong;
		double meter;

		System.out.print("평을 입력하시오 : ");
		pyeong = input.nextInt();

		meter = pyeong * 3.3058;
		System.out.println(pyeong + "평은 " + meter + "평방미터입니다.");

	}

}
