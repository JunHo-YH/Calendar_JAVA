package honux.calendar;

import java.util.Scanner;

public class MaxDayOfMonth {
	public static int getMaxDay(int month) {
		int[] month_day = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
		return month_day[month - 1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요: ");
		int month = scan.nextInt();
		
		System.out.printf("   << %d년 %d월 >>\n", 2020, month);
		for(int i = 1; i <= getMaxDay(month); i++) {
			
			if(i > 0 && i < 10) {
				System.out.print(" " + i + " ");	
			}else {
				System.out.print(""+ i + " ");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
