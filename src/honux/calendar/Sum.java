package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력: 키보드로 두 수의 입력을 받는다.
		// 출력: 두 수의 값을 출력한다.
		
		
		System.out.print("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
//		System.out.println("두 수의 합은: " + (num1 + num2) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", num1, num2, num1 + num2);
	}
}
