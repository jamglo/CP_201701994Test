package 과제10;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Rectangle();
		shape[2] = new Circle();

		Scanner sc = new Scanner(System.in);
		System.out.println("- 도형의 넓이 구하기 (1, 2 : 가로와 세로 순서로 입력해 주세요 / 3 : 계산 결과 // 원은 세로를 0으로 입력해 주세요) -");
		System.out.println("~ 입력하는 순서는 삼각형, 사각형, 원 입니다. ~");
		for (int i = 0; i < shape.length; i++) {
			System.out.println();
			shape[i].Shape(sc.nextInt(), sc.nextInt());
			System.out.println(shape[i].area());
		}
	}
}