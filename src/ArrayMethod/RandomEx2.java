package ArrayMethod;

import java.util.Scanner;

public class RandomEx2 {

	public static void main(String[] args) {
		int arr1[] = new int[6];
		int arr2[] = new int[6];
		
		for (int i = 0 ; i < arr1.length ; i++) {
			arr1 [i] = (int)(Math.random()*45) + 1;
			for (int j=0 ; j<i ; ++j) {
				if (arr1[i]== arr1[j]) {
					i--; 
					break;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < arr2.length ; i ++) {
			do {
				System.out.print(i+1+" 번째 수를 입력해 주세요 : ");
				arr2[i] = sc.nextInt();
			}while (arr2[i] <1 || arr2[i] > 45 );
			for (int j=0 ; j<i ; ++j) {
				if (arr2[i]== arr2[j]) i--; break;
			}
		}
		
		int cnt = 0;
		for (int i =0 ; i < arr1.length; ++i) {
			for (int j = 0 ; j < arr2.length ; j++) {
				if (arr1[i] == arr2[j]) cnt++ ;
			}
		}
		System.out.println(cnt +"개 맞추셧습니다.");
		for (int i = 0 ; i < 6 ;i++) System.out.println(arr1[i]);
		
		
		
		
	}

}
