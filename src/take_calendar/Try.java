package take_calendar;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != -1) {
			get(input);
			input = scan.nextInt();
		}
		System.out.println("프로그램이 종료되었습니다.");

	}
	public static void get(int month) {
		if (month == 2) {
			System.out.println("  일   월   화   수  목    금   토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
		} else if (month % 2 == 0) {
			System.out.println("  일   월   화   수  목    금   토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30 31");
		} else {
			System.out.println("  일   월   화   수  목    금   토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30");
		}
	}

}
