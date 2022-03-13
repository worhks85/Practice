package Extend;
/*
 * 상속
 * 
 * - 기존 클래스를 재사용 하여 새로운 클래스를 작성
 * - 두 클래스를 부모와 자식 관계를 맺어주는것
 * - 자손은 보무의 모든 멤버를 받아옴
 * - 키워드는 extends
 * 
 * Object class
 * - 조상이 없는 클래스
 * - 모든 클래스는 Object class를 직 간접적으로 상속
 * - 모든 클래스의 최고 조상
 * 
 * 상속관계
 * 
 * - 공통 부분은 조상에서 관리
 * - 개별부분은 자손에서 관리
 * - 조상의 변경 -> 상속받은 모든 클래스에 영향
 * - 자손의 변경 -> 자손의 클래스만 영향
 * 
 * 오버라이드 < -- > 오버로딩 = 기존에 없는걸 새로 만듬
 * - 조상 클래스로부터 상속받은 메서드의 내용을 자식 클래스에 맞게 변경하여 사용
 * 
 * super 
 * -조상의 멤버와 자신의 멤버를 구별하는데 쓰임
 *  
 * 
 * 
 */

import java.util.Scanner;

class SungJuk{
	String name;
	int kor,eng,mat;
	int tot,rank;
	public void sumTot() {
		tot = kor + eng + mat;
	}
	public void disp() {
		System.out.print(name +"\t");
		System.out.print(kor +"\t");
		System.out.print(eng +"\t");
		System.out.print(mat +"\t");
		System.out.print(tot + "\t");
		System.out.print(rank + "\t\n");
		
	}
}
class SungJuk2 extends SungJuk{  
	
}
public class ExtendEx1 {

	public static void main(String[] args) {
		System.out.print("인원수를 입력 :");
		Scanner sc = new Scanner(System.in);
		int inwon = sc.nextInt();
		SungJuk sj[] = new SungJuk[inwon];
		for (int i = 0 ; i < inwon ; ++i) {
			sj[i] = new SungJuk();
			System.out.print("이름을 입력하세요 : ");
			sj[i].name = sc.next();
			System.out.print("국어점수을 입력하세요 : ");
			sj[i].kor = sc.nextInt();
			System.out.print("영어점수을 입력하세요 : ");
			sj[i].eng = sc.nextInt();
			System.out.print("수학점수을 입력하세요 : ");
			sj[i].mat = sc.nextInt();
			sj[i].sumTot();
			sj[i].rank = 1;
		}
		for(int i = 0 ; i < inwon ; i++) {
			for (int j = 0 ; j < inwon ; j++) {
				if(sj[i].tot <sj[j].tot) sj[i].rank++;
			}
		}
		
		
		System.out.print("이름\t국어\t영어\t수학\t총점\t순위\n");
		for (int i = 0 ; i < inwon;i++) sj[i].disp();

	
		
		
	}

}
