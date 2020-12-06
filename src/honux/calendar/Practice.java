package honux.calendar;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int[][] score = {
				  {100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}		
		};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int k = 0; k < score[i].length; k++) {
				System.out.printf("score[%d][%d] = %d\n", i, k, score[i][k]);
				
				sum += score[i][k];
			}
			
		}
		System.out.println("sum = " + sum);
		// 전체 1회독하기.
		
		
	}

}
