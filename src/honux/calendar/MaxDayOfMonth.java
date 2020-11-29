package honux.calendar;

import java.util.Scanner;

public class MaxDayOfMonth {
	public static int getMaxDay(int month) {
		int[] Month = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
		return Month[month - 1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요: ");
		int Month = scan.nextInt();

		System.out.println(getMaxDay(Month));

	}

}
