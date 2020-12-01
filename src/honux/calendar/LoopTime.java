package honux.calendar;

import java.util.Scanner;

public class LoopTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 번 반복하시겠습니까? ");
		int time = scan.nextInt();
		
		for(int i=0, count = 1; i < time; i ++, count++) {
			
			System.out.println("반복을 시작합니다." + count);
		}
		System.out.println("총" + time + "번 반복했습니다.");
	}

}
