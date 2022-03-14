package Collection;
/*
 *  회사의 부서 : 개발부 , 영업부 , 총무부 , 관리부
 *  개발부 - 홍길동 , 홍길순 , 강순호
 *  
 *  인원이 많다. 따라서 키 값은 부서명, 데이터는 HashSet타입으로 저장
 *  
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Company{
	private HashMap map;
	private Scanner in;
	private HashSet[] hs;
	private String aa[];

	public Company() {
		map = new HashMap();
		in = new Scanner(System.in);
		hs = new HashSet[4];
		for (int i = 0 ; i<4 ; ++i) {
			hs[i] = new HashSet();
		}
		aa= new String[] {"개발부", "영업부","총무부","관리부"};

	}


	public void insert() throws IOException{
		int select = System.in.read() -48 ;
		System.out.print("이름을 입력 : ");
		String name = in.next();
		hs[select-1].add(name);
		map.put(aa[select-1], hs[select-1]);
	}
	public void edit() {


	}
	public void delete() throws IOException {
		System.out.print("1.개발부 2.영업부 3.총무부 4.관리부 : ");
		int select = System.in.read()-48;
		HashSet delete = (HashSet)map.get(aa[select-1]);


	}
	public void view() throws IOException{
		System.out.print("1.개발부 2.영업부 3.총무부 4.관리부 : ");
		int select = System.in.read()-48;
		HashSet view = (HashSet)map.get(aa[select-1]);

	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}



public class CollectionEx4 {

	public static void main(String[] args) throws IOException {
		Company com = new Company();
		while(true) {
			System.out.print("1.입력 2.수정 3.삭제 4.보기 5.종료 :");
			int select = System.in.read() -48;
			while(System.in.read() !='\n') {}
			switch (select){
			case 1: com.insert(); break;
			case 2: com.edit(); break;
			case 3: com.delete(); break;
			case 4: com.view(); break;
			case 5: com.exit(); break;
			default: System.out.println("잘못 입력하셧습니다.");

			}





		}

	}
}
