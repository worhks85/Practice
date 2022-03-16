package Class;

import java.util.HashSet;
import java.util.Iterator;

/****************************************************************************************
 * 접근제한자
 *  
 * private 
 *  - 해당 클래스 안의 멤버에서만 접근이 가능									작다
 *  - 외부 객체에서는 절대로 접근을 할 수 없음
 *  - 멤버의 은닉화를 시킬 때 사용
 *  - 거의 대부분의 멤버필드에 적용
 *  
 *  default
 *  - 접근제한자를 명시하지 않은 경우에는 디폴트로 접근 제한자가 생김						
 *  - 같은 패키지(폴더) 내의 클래스들은 접근을 허용하고, 다른 곳에서는 접근 불가
 *  
 *  protected
 *  - 클래스 멤버를 자신과 같은 패키지 상속받은 클래스에서만 접근을혀용
 *  - 상속받는 클래스가 다른 패키지여도 상관없음
 *  
 *  public
 *  - 다른 클래스에서 해당 멤버를 사용할 수 있음									크다
 *  - 보통 멤버 메소드, 생성자에 사용을 함
 *  
 *  ***************************************************************************************
 *  객체지향언어의 속성
 *  
 *  은닉화
 *  멤버필드를 다른 곳에서 직접 접근 못하게 함
 *  - 멤버에 접근을 못하게 하기 위해 private을 사용
 *  - 접근을 하기 위해 접근 메소드를 만들어 줌
 *  - 값을 설정할 때는 setter메소드 가져올때는 getter메소드를 사용함
 *  - 보통 멤버 필드값을 은닉화해서 값을 보호하는데 이용
 *  
 *   
 ****************************************************************************************
 *  지정예약어
 *  
 *  static
 *  - 하나의 클래스로 발생된 모든 객체가 공유하는 필드를 선언할 때 사용
 *  - 클래스 명으로 접근
 *  - 메모리에 프로그램 시작후 바로 올라감
 *  - 메소드에 선언읻 되면 static멤버만 사용 가능
 *  - 힙 이 아닌 사우 및 메소드 부에 같이 공유 하게됨
 *   
 *  final
 *  - 마지막 값을 바꿀수 없음  
 *  - 메소드에 사용되면 메소드 변경 불가
 *  - 클래스에 설정하면 상속 불가
 *  
 *  
 *  static final
 *  - static 기능과 final 기능을 합쳐놓은것
 *  - 객체가 여러개가 돠더라도 모든 객체가 값을따로 가질 필요가 없고,
 *  - 그 값을 상수처럼 사용하고자 할 때 사용하는 키워드
 *  - 자바의 상수를 설정해줄때 
 *  
 *  transient
 *  - 직렬화 역직렬화를 하지 않겠다는 뜻
 *  - 자바 I/O를 배운후 공부
 *  
 *  abstract
 *	- 추상화를 의미
 *  - 추상화 메소드가 존재하면 그 클래스는 추상화클래스
 *  - 추상화클래스를 상속 받으면 반드시 추상화 메소드를 구현하여야함
 *  - 추상화 클래스는 객체를 생성 할 수 없음
 * 
 * 	synchronized
 * 	- 동기화를 의미
 *  - 2개이상의 스레드가 실행될 때 사용
 *  - 스타크래프트의 미네랄을 캐는것을 생각하면 됨
 *  
 */
import java.util.*;
public class ClassEx2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		String a = new String("유재석");
		String b = "강호동";
		hs.add(a);
		hs.add(b);
		hs.add("정형돈");
		hs.add("김제동");
		
	
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
//		System.out.println(hs.size());
//		hs.remove("김제동");
//		System.out.println(hs.size());
		System.out.println(hs.size());
		hs.remove("김제동");
		System.out.println(hs.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
//class Sunguk{
//	private String name;
//	private int kor,eng,mat;
//	private int tot,rank;
//	public void setName(String name) {
//		this.name = name;
//	}
//	private boolean setKor( int kor) {
//		if (kor < 0 || kor > 100) return false;
//		this.kor = kor;
//		return true;
//	}
//	private boolean setEng( int eng) {
//		if (eng < 0 || eng > 100) return false;
//		this.eng = eng;
//		return true;
//	}
//	private boolean setMat( int mat) {
//		if (mat < 0 || mat > 100) return false;
//		this.mat = mat;
//		return true;
//	}
//	public void sumTot() {
//		tot = kor + eng + mat;
//	}
//	public int getTot() {
//		return tot;
//		
//	}
//	public void clearRank() {
//		rank = 1;
//	}
//	
//	public void disp() {
//		System.out.print(name +"\t");
//		System.out.print(kor +"\t");
//		System.out.print(eng +"\t");
//		System.out.print(mat +"\t");
//		System.out.print(tot + "\t");
//		System.out.print(rank + "\t\n");
//		
//	}
//}
