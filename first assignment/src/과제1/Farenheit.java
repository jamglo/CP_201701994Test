package 과제1;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		double farenheit;
		double celcius;

		Scanner input = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하시오: ");
		farenheit = input.nextDouble();

		celcius = (farenheit - 32) * 5 / 9;
		System.out.println("섭씨 온도는 " + celcius + "입니다.");

	}

}
