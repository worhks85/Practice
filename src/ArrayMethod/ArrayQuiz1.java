package ArrayMethod;

import java.util.Scanner;

// 10���� ���� �Է¹޾� ���� ������ ����ϱ�
public class ArrayQuiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		for (int i = 0 ; i  < arr.length ; i++) {
			System.out.print(i +1 + " ��° ���� �Է��� �ּ��� : ");
			arr[i] = sc.nextInt();	
		}
		
		for ( int i = 0 ; i < arr.length-1  ; i++) {
			for ( int a = i+1 ; a < arr.length ; a ++) {
				if (arr[i] > arr[a]) {
					int tmp = arr[i];
					arr[i] = arr[a];
					arr[a] = tmp;
					
				}
			}
			
		}
		for ( int i =0 ; i < arr.length-1 ; i++ ) System.out.print(arr[i] +",");
		System.out.println(arr[arr.length-1]);
	}

}
