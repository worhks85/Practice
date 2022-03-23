package usefulClass.utilClass;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력 : ");
		int month = sc.nextInt();
		
		Calendar ca = Calendar.getInstance();
		ca.set(year,month-1,1);
		int week = ca.get(Calendar.DAY_OF_WEEK);
		int lastDay= ca.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("\t\t" +year + " 년  " + month +" 월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
