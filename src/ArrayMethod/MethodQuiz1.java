package ArrayMethod;

public class MethodQuiz1 {

	public static void main(String[] args) {
		
		//피보나치 수열 구하기
		//1 , 1, ,2, 3 , 5 ,8 , 13 , 21 , 34, 55, 89
		for (int i = 0 ; i<10; ++i) {
			System.out.print(Pivo(i) + " ,");
		}
		System.out.println(Pivo(10));

	}
	public static int Pivo(int n ) {
		if (n<3) return 1;
		return Pivo(n-2) + Pivo(n-1);
	}
}
