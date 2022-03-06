package ArrayMethod;

public class DimentionArray {

	public static void main(String[] args) {
		//홀수 마방진 , 5의 마방진
		//가로,세로,대각선의 합이 모두 같은 진
		int arr[][] = new int [5][5];
		int i = 0 , j =2; //1. 첫번째줄 가운데 열에서 시작
		int co = 1;
		while (co<=25) {
			arr[i][j]= co;
			int oldi = i;
			int oldj =j;
			
			i--; j++;// 오른쪽 대각선 위로 이동
			
			if (i < 0 ) i =4; //3. 행이 음수가 되면 그 열의 최대행으로 이동
			if ( j> 4 ) j =0; //4. 열이 배열의 값을 벗어나면 0열로 이동
			if (arr[i][j] != 0 ) {
				i = oldi;
				j = oldj;	//원래 위치로 이동시킨다.
				i++;			//행을 하나 증가시킨다.
				
			}
			co++;
			
		}
		for (i = 0; i<5 ;++i) {
			for(j = 0 ; j <5;++j) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
		
				
		

		
		
		
		
		
		
		
		
	}

}
