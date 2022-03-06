package Class;

import java.io.IOException;
import java.util.Scanner;

/*
클래스란?
일반화된 속성과 메소드로 객체를 기술한것을 클래스라고함

클래스의 기본 구성

접근제한자	지정예약어		class	class이름
						extends클래스		implements인터페이스{멤버필드, 멤버메소드, 생성자, 중첩클래스}

클래스 밖에 쓰일수 있는 것은 package, import, 또 다른 클래스

1. 멤버필드
2. 멤버메소드
3. 생성자
4. 접근제한자
5. 지정예약어
6. 중첩클래스
7. 상속
8. 다형성
9. 추상 
10. 인터페이스

자동차 클래스 안에

메소드(기능,행위) = 차가움직인다, 속도를 높인다, 차를멈춘다, 속도를 높인다 , 엔진에 연료를 공급
필드 ( 변수, 속성)= 중량, 배기랑, 사용연료, 최고속도, 색상

메소드가 합쳐져서 하나의 클래스가 완성

Field 
 - 데이터 저장공간 (멤버변수 = 크래스 안에 있는 멤버)
 - 참고) 메소드 안에서 선언한 변수는 지역변수라고 함
 
Method
 - 특정 행위의 기술 영역 ( 멤버메소드 )  
 
 프로그래밍에서의 객체
 - 상태와 행위의 잡합체이다. 즉 속성(필드,데어타) 와 메소드(함수 , 행위)의 집합체임
 
 속성 (필드)
 객체의 정적 특성으로 객체가 가지고있는 정보를 보관하는 기억장소로 사용되는 데이터영역
 
 메소드 (기능)
 객체의 동적 특성으로서 객체의 데이터를 엑세스하거나 또는 객체가 가지고 있는 속성을 변경하는 일을 함
 
 객채의 선언
 클래스명 객체참조변수 (변수이름);
 
 객체의 생성
 객체참조변수 (변수이름) = new 클래스명();
 
 객체의 선언과 생성
 클래스명 객체참조변수(변수이름) = new 클래스명();
 
				생성자
Car car01 = new Car();
레퍼런스변수	인스턴스생성

 new 연산자 다음에 클래스()
 
생성자 : 클래스로부터 객체가 생성될 때 초기화 과정을 기술하는 특수한 메소드
 - 클래스명과 동일한 메소드
 - 결과형 리턴값이 없음
 - 객체 생성시 반드시 하나의 생성자 호출
 - 생성자를 없으면 자동으로 default생성자가 생김 (JVM)
 - 생상자 오버로딩 할 수 있음
 - 멤버 필드 값 초기화를 위한 만든 메소드
 - 객체를 생성할 때만 사용이 가능
 
 this this()
 객체를 선언 한 후 객체 자신을 의미
 this 뒤에 참조
 
 
*/
class Room{
	boolean room[];
	Scanner sc;
	int roomsu;
	Room(){
		sc = new Scanner(System.in);
		System.out.print("방 의 갯수를 입력 : ");
		int roomsu = sc.nextInt();
		room = new boolean[roomsu];
		
	}
	public void input() {
		System.out.print("입실하실 방의 번호 " );
		int roomNumber = sc.nextInt();
		if (roomNumber > 10 || roomNumber < 1 ) input();
		if (room[roomNumber- 1]) {
			System.out.println(roomNumber+"호실은 사용중입니다.");
			
		}
		else {
			System.out.println(roomNumber+"호실에 입실하셧습니다.");
			room[roomNumber-1] = true;
		}
	}
	public void output() {
		System.out.print("퇴실하실 방의 번호 " );
		int roomNumber = sc.nextInt();
		if (roomNumber > 10 || roomNumber < 1 ) output();
		if (!room[roomNumber- 1]) {
			System.out.println(roomNumber+"호실은 빈방입니다.");
			
		}
		else {
			System.out.println(roomNumber+"호실에 퇴실하셧습니다.");
			room[roomNumber-1] = false;
		}
	}
	public void view() {
		for (int i = 0 ; i<roomsu ;++i) {
			if(room[i]) {
				System.out.println(i + 1 + "호실은 사용중입니다.");
			}
			else System.out.println("지금 빈방입니다.");
		}
	}
	public void exit() {
		System.out.println("프로그램을 종료하겠습니다.");
		System.exit(0); // 프로그램 전체 종료
	}
	
}
public class ClassEx1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		Room room = new Room();
		
		while (true) {
			System.out.print("1.입실 2.퇴실 3.방보기 4.종료 : ");
			int select = System.in.read()-48;
			sc.nextLine();
			switch (select) {
			case 1: 
				room.input(); break;
			case 2: 
				room.output(); break;
			case 3: 
				room.view(); break;
			case 4: 
				room.exit(); break;
			default:
				System.out.println("잘못 입력 하셧습니다.");
			}
			
			
		}
		
		
		

	}

}

