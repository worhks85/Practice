/*
 * 지시자 
 * %b 		불린 형식으로 출력
 * %d 		10진수
 * %o 		8진수 형식으로 출력
 * %X 		16진수
 * %f 		floating 형식으로 출력
 * %e, %E 	지수 형식으로 출력
 * %c 		문자로 출력
 * %s 		문자열로 출력
 * %n		줄바꿈
 * System.out.printf ("%d ", 입력하고싶은값)
 *  System.out.printf("age: %d year:d \n" ,14 , 2017)
 *  "age : 14 year : 2017 \n" 이화면에 출력된다.   
 *  
 *  %자리수d	printf("\n%5d\n", 16) 	(   16)	빈공간이 왼쪽에 생김
 *  %-자리수d	printf("\n%-5d\n",16) 	(16   )	빈공간이 오른쪽에 생김
 *  %0자리수d	printf("\n%05d\n",16)	(00016)	빈공간이 0으로 채워짐
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
		System.out.printf("%10.8f %n", d);		//"%10.8f" 앞으로 10자리 들여쓰기를 하고 소수점8번째 자리까지 쓴다.
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
