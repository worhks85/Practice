package usefulClass.utilClass;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int year = sc.nextInt();
		System.out.println("���� �Է� : ");
		int month = sc.nextInt();
		
		Calendar ca = Calendar.getInstance();
		ca.set(year,month-1,1);
		int week = ca.get(Calendar.DAY_OF_WEEK);
		int lastDay= ca.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("\t\t" +year + " ��  " + month +" ��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i = 1 ; i<week ; ++i) {
			System.out.print("\t");
			
		}
		for(int i = 1 ; i <=lastDay ; ++i) {
			System.out.print(i+"\t");
			week++;
			if (week > 7 ) {
				week =1;
				System.out.println();
			}
		}
		
		
	}

}
