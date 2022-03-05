package ArrayMethod;

import java.util.Scanner;

/*
 * 배열 - 	자료형이 동일한 여러개의 값을 연이어 저장할 수 있도록 하는	기억 공간의 집합체
 * 원소 - 	배열에 저장된 각각의 값
 * 인덱스	- 	배열의 원소에 접근하기 위한 첨자
 * 
 * 
 * 자바 메모리의 구조
 * 
 * 		상수 및 메소드부 	- JVM 시작시 생성
 * 						- static 변수 class 런타임 상수 method 정보 보관
 * 
 * JVM 			힙		- 데이터를 저장하는 공간
 * 						- 가비지 컬렉터(GC)의 관리대상
 * 		
 * 			스택			- 데이터의 주소값을 보관하는 영역
 * 	
 * 
 * 레퍼런스 변수 - 기본 데이터를 값으로 갖는 것이 아니고 메모리상이 다른 객체나 배열을 가르키고 있는 변수
 * EX) int[] a = new int[5];  -> a == [ 1 , 2 , 3 , 4 , 5 ]
 * 스택 안에 힙에 있는 a[]의 주소값을 a에 저장 
 * 힙에 a[]의 데어터값 저장
 * 
 * 초기 값을 콤마로 구분하여 여러번 기술하고 이들을 중괄호 {} 로 감싸줌
 * 
 * ex 	int [] a = {10, 20, 30, 40 ,50};
 * 		int [] a = new int[]{10, 20 ,30 ,40 ,50}
 * 
 * a.length == 배열의 갯수
 * 
 * 
 * 
 * 
 */
public class ArrayEx1 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int arr [] = new int [10];
		int sum = 0 ;
		for (int i = 0 ; i < arr.length; ++i) {
			System.out.print(i + 1 + "번쨰 수를 입력해 주세요 : ");
			arr [i] = scanner.nextInt();
			sum += arr[i];
		}
		for (int i = 0 ; i<arr.length ; i++) System.out.print(arr[i] + ",");
		System.out.println();
		System.out.println( "총 합은" + sum + " 입니다.");
		
		
		
		}
			
	
	
	
	}
	
