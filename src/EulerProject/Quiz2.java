package EulerProject;

/*
피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 
1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
 */

public class Quiz2 {

	public static void main(String[] args) {
		int sum = 0;
		int i1 = 0;
		int i2 = 1;
		int i3 = 0;
		while (i3 < 4000000) {
			i3 = i2 + i1;
			if (i3%2 ==0) sum += i3;
			i1 = i2;
			i2 = i3;  		
				
		}
		System.out.println(sum);

	}

}
