package Class;

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


public class ClassArray {

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
