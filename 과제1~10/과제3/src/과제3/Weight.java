package 과제3;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		double average;
		int height, weight;
		Scanner in = new Scanner(System.in);

		System.out.print("키를 입력하시오(cm): ");
		height = in.nextInt();
		System.out.print("몸무게를 입력하시오(kg): ");
		weight = in.nextInt();

		average = (height - 100) * 0.9;
		System.out.println("표준 체중은 " + average + "kg입니다.");

		if (weight < average)
			System.out.println("당신은 저체중입니다.");
		else if (weight == average)
			System.out.println("당신은 표준 체중입니다.");
		else if (weight > average)
			System.out.println("당신은 과체중입니다.");

	}

}
