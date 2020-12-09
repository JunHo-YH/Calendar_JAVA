class Ex5_5_1 { 
	public static void main(String[] args) { 
		int[] ball = new int[45];  // 45���� �������� �����ϱ� ���� �迭 ����.      

		// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�. 
		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;    // ball[0]�� 1�� ����ȴ�.

		int tmp = 0;   // �� ���� �ٲٴµ� ����� �ӽú��� 
		int j = 0;     // ������ ���� �� ������ ���� 

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�. 
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i=0; i < 6; i++) {       
			j = (int)(Math.random() * 45); // 0~44������ ������ ���� ��´�. 
			tmp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = tmp; 
		} 

		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
}