package 과제6;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하시오: ");
		str = in.nextLine();
		sb.append(str);
		
		System.out.println(sb.reverse());

	}

}
