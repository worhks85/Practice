package usefulClass.utilClass;

import java.util.Calendar;
import java.util.Date;

/*
 * CalendarŬ���� DateŬ����
 * - ��¥�� �ð��� ������ �����͸� ó���ϴ� Ŭ����
 * 
 * 
 * Date class
 * - Date()�����ڸ� �̿��Ͽ� ��ü�� ����
 * 
 * Calendar class - �߻� Ŭ����
 * Calendar c = Calendar.getinstance()
 * 
 * static int 
 * DATE	: ���� ��
 * DAY_OF_WEEK : ����
 * HOUR : ���� �Ǵ� ���� ���
 * HOUR_OF_DAY : �ð�
 * MINUTE : ��
 * MONTH : �� - > 0�� = 1��
 * SECOND : ��
 * YEAR : ��
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
		
		System.out.printf("������ ��¥ : %d %d %d %d %d %d\n",year,month,day,hour,m,s);
		System.out.println(date);
		System.out.println(year);
		
				
		
		
		
		
	}

}
