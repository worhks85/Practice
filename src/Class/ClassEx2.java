package Class;

import java.util.HashSet;
import java.util.Iterator;

/****************************************************************************************
 * ����������
 *  
 * private 
 *  - �ش� Ŭ���� ���� ��������� ������ ����									�۴�
 *  - �ܺ� ��ü������ ����� ������ �� �� ����
 *  - ����� ����ȭ�� ��ų �� ���
 *  - ���� ��κ��� ����ʵ忡 ����
 *  
 *  default
 *  - ���������ڸ� ������� ���� ��쿡�� ����Ʈ�� ���� �����ڰ� ����						
 *  - ���� ��Ű��(����) ���� Ŭ�������� ������ ����ϰ�, �ٸ� �������� ���� �Ұ�
 *  
 *  protected
 *  - Ŭ���� ����� �ڽŰ� ���� ��Ű�� ��ӹ��� Ŭ���������� ����������
 *  - ��ӹ޴� Ŭ������ �ٸ� ��Ű������ �������
 *  
 *  public
 *  - �ٸ� Ŭ�������� �ش� ����� ����� �� ����									ũ��
 *  - ���� ��� �޼ҵ�, �����ڿ� ����� ��
 *  
 *  ***************************************************************************************
 *  ��ü�������� �Ӽ�
 *  
 *  ����ȭ
 *  ����ʵ带 �ٸ� ������ ���� ���� ���ϰ� ��
 *  - ����� ������ ���ϰ� �ϱ� ���� private�� ���
 *  - ������ �ϱ� ���� ���� �޼ҵ带 ����� ��
 *  - ���� ������ ���� setter�޼ҵ� �����ö��� getter�޼ҵ带 �����
 *  - ���� ��� �ʵ尪�� ����ȭ�ؼ� ���� ��ȣ�ϴµ� �̿�
 *  
 *   
 ****************************************************************************************
 *  ���������
 *  
 *  static
 *  - �ϳ��� Ŭ������ �߻��� ��� ��ü�� �����ϴ� �ʵ带 ������ �� ���
 *  - Ŭ���� ������ ����
 *  - �޸𸮿� ���α׷� ������ �ٷ� �ö�
 *  - �޼ҵ忡 ����� �Ǹ� static����� ��� ����
 *  - �� �� �ƴ� ��� �� �޼ҵ� �ο� ���� ���� �ϰԵ�
 *   
 *  final
 *  - ������ ���� �ٲܼ� ����  
 *  - �޼ҵ忡 ���Ǹ� �޼ҵ� ���� �Ұ�
 *  - Ŭ������ �����ϸ� ��� �Ұ�
 *  
 *  
 *  static final
 *  - static ��ɰ� final ����� ���ĳ�����
 *  - ��ü�� �������� �´��� ��� ��ü�� �������� ���� �ʿ䰡 ����,
 *  - �� ���� ���ó�� ����ϰ��� �� �� ����ϴ� Ű����
 *  - �ڹ��� ����� �������ٶ� 
 *  
 *  transient
 *  - ����ȭ ������ȭ�� ���� �ʰڴٴ� ��
 *  - �ڹ� I/O�� ����� ����
 *  
 *  abstract
 *	- �߻�ȭ�� �ǹ�
 *  - �߻�ȭ �޼ҵ尡 �����ϸ� �� Ŭ������ �߻�ȭŬ����
 *  - �߻�ȭŬ������ ��� ������ �ݵ�� �߻�ȭ �޼ҵ带 �����Ͽ�����
 *  - �߻�ȭ Ŭ������ ��ü�� ���� �� �� ����
 * 
 * 	synchronized
 * 	- ����ȭ�� �ǹ�
 *  - 2���̻��� �����尡 ����� �� ���
 *  - ��Ÿũ����Ʈ�� �̳׶��� ĳ�°��� �����ϸ� ��
 *  
 */
import java.util.*;
public class ClassEx2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		String a = new String("���缮");
		String b = "��ȣ��";
		hs.add(a);
		hs.add(b);
		hs.add("������");
		hs.add("������");
		
	
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
//		System.out.println(hs.size());
//		hs.remove("������");
//		System.out.println(hs.size());
		System.out.println(hs.size());
		hs.remove("������");
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
