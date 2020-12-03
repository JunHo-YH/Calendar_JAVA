package honux.calendar;

import java.util.Scanner;

public class MaxDayOfMonth {
	private static final int[] MAX_DAYS = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
	private static final int[] Leap_MAX_DAYS = { 31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

	public static boolean isLeapYear(int year) { // 윤년 확인하는 메서드
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int getMaxDay(int year, int month) { // 해당 월의 마지막 일을 출력하는 메서드
		if (isLeapYear(year)) {
			return Leap_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public static void printCalendar(int year, int month) {
		System.out.printf("   << %d년 %d월 >>\n", year, month);
		for (int i = 1; i <= getMaxDay(year, month); i++) {

			if (i > 0 && i < 10) {
				System.out.print(" " + i + " ");
			} else {
				System.out.print(i + " ");
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("달을 입력하세요 : ");
		int month = scan.nextInt();

		printCalendar(year, month);

	}
	
	// 조금 더 디테일하게 만들어보기.
}
