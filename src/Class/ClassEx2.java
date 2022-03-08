package Class;
/****************************************************************************************
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
 *   
 *  
 *  
 */
public class ClassEx2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

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
