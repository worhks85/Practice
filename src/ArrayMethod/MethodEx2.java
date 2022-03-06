package ArrayMethod;

import java.io.IOException;
import java.util.Scanner;

public class MethodEx2 {
	// 두개의 수와 한개의 산술 연산자를 입력 받아 그 연산자 대로 하는 프로그램
	//단 연산자가 뺄셈일때는 큰수에서 작은수를 빼서 계산
	//나눗셈 일때는 2번째 수가 0이면 1로 고쳐서 계산
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int su1 = input();
		int su2 = input();
		int result  = 0;
		System.out.print("산술 연산자를 입력 : ");
		char op = (char)System.in.read();
		switch (op) {
		case '+' :
			result =  plus(su1,su2);
			break;
		case '-' :
			result =  min(su1,su2);
			break;
		case '*' :
			result =  mul(su1,su2);
			break;
		case '/' :
			result =  div(su1,su2);
			break;
		default:
			System.out.println("연산자를 잘못 입력하셧습니다.");
		}
		System.out.println("결과는 "+result +" 입니다.");
		
		
		
		
	}
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 수 입력 : ");
		int su = scanner.nextInt();
		return su;
	}
	
	public static int plus(int a , int b) {
		return a+b;
		
	}
	
	public static int min(int a , int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		return max-min;
		
	}
	
	public static int mul(int a , int b) {
		return a*b;
	}
	
	public static int div(int a , int b) {
		if (b == 0 ) b=1;
		return a/b;
	}
	
	

}