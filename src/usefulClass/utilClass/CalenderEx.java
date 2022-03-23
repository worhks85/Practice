package usefulClass.utilClass;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar클래스 Date클래스
 * - 날짜와 시간에 관련한 데이터를 처리하는 클래스
 * 
 * 
 * Date class
 * - Date()생성자를 이용하여 객체를 생성
 * 
 * Calendar class - 추상 클래스
 * Calendar c = Calendar.getinstance()
 * 
 * static int 
 * DATE	: 달의 날
 * DAY_OF_WEEK : 요일
 * HOUR : 오전 또는 오후 몇시
 * HOUR_OF_DAY : 시간
 * MINUTE : 분
 * MONTH : 달 - > 0월 = 1월
 * SECOND : 초
 * YEAR : 해
 * 
 * 
 */
public class CalenderEx {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.printf("오늘의 날짜 : %d %d %d %d %d %d\n",year,month,day,hour,m,s);
		System.out.println(date);
		System.out.println(year);
		
				
		
		
		
		
	}

}
