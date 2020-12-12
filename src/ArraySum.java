
public class ArraySum {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		int total = 0;	
		float average = 0;
		

		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				total += arr[i][k];
			}
		}		
		
		System.out.println("total = " + total);
		System.out.printf("average = %f", total / (float)(arr.length * arr[0].length));
		
		


	}

}
