package ForWhileEx;
/*
 * while (조건){
 * 	조건에 만족하면 실행 후 다시 조건 비교 
 * }
 */
public class WhilePractice {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i ;
			i++;
		}
		System.out.println(sum);

		
		
	}

}
