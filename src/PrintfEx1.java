/*
 * ������ 
 * %b 		�Ҹ� �������� ���
 * %d 		10����
 * %o 		8���� �������� ���
 * %X 		16����
 * %f 		floating �������� ���
 * %e, %E 	���� �������� ���
 * %c 		���ڷ� ���
 * %s 		���ڿ��� ���
 * %n		�ٹٲ�
 * System.out.printf ("%d ", �Է��ϰ������)
 *  System.out.printf("age: %d year:d \n" ,14 , 2017)
 *  "age : 14 year : 2017 \n" ��ȭ�鿡 ��µȴ�.   
 *  
 *  %�ڸ���d	printf("\n%5d\n", 16) 	(   16)	������� ���ʿ� ����
 *  %-�ڸ���d	printf("\n%-5d\n",16) 	(16   )	������� �����ʿ� ����
 *  %0�ڸ���d	printf("\n%05d\n",16)	(00016)	������� 0���� ä����
 *  
 *  */
public class PrintfEx1 {

	public static void main(String[] args) {
//		System.out.println(10/3.0);
//		String ex = Integer.toOctalString(26);
//		System.out.println(ex);
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
		
		double f = 123.456789123456789;
		System.out.printf("%f%n", f);
		System.out.printf("[%5d]%n" , 1234567);
		System.out.printf("[%-5d]%n" , 10);
		System.out.printf("[%05d]%n" , 10);
		double d = 1.23456789;
		System.out.printf("%f%n",d);
		System.out.printf("%10.8f %n", d);		//"%10.8f" ������ 10�ڸ� �鿩���⸦ �ϰ� �Ҽ���8��° �ڸ����� ����.
		System.out.printf("[%s]%n", "www.naver.com");
		System.out.printf("[%20s]%n", "www.naver.com");
		System.out.printf("[%-20s]%n", "www.naver.com");
		System.out.printf("[%.9s]%n", "www.naver.com");
		
		
	}

}

/*
 * System.out.printf("[%5d]%n" ,10);	[   10]
 * System.out.printf("[%-5d]%n" ,10);	[10   ]
 * System.out.printf("[%05d]%n" ,10);	[00010]
 */
