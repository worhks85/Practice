package Collection;
/*
 * Java Collection
 * - ��� ��ü���� ����/���� �ϱ� ���� Ŭ����
 * - �迭�� ���� �����ü�� �����ϱ� ���� Ŭ�������� ��Ʋ�� �̸��� ��
 * - ����ϴ� ������ �迭�� ������, �����ϴ� ����� ǳ��
 * 
 * Collection Object
 * �������� ��Ҹ� ���� �ϳ��� ��ü�� ���� ���� �ǹ�, �����̳ʶ�� �θ�
 * 
 * Collection Framework
 * �÷��� Ŭ������� �������̽����� ������ ��Ʋ�� ���´� ��
 * 
 * List		( java.util.List )
 * - ������ �ִ� �������� ����
 * - ������ �ߺ� ���
 * - ���� ���̸� ����
 * �ֿ� Ŭ���� - ArrayList, LinkedList, Vector 
 * 
 * Map		(java.util.Map)
 * - key�� value ������ �̷���� �������� ����
 * - key�� �ߺ� �Ұ�, value �ߺ� ���
 * - ������ ���� key���� ���� key�� ����� ��ü���� ����
 * �ֿ� Ŭ���� - HashMap, HashTable , TreeMap
 * 
 * Set 		(java.util.Set)
 * - ���� ������ �ʿ���� �������� ����
 * - ������ �ߺ� �Ұ�
 * �ֿ� Ŭ���� - HashSet, TreeSet
 * 
 * 
 * ������
 *  - HashSet() ����Ʈ�� �ʱ�뷮 (16) �� ���ϰ�� (0.75)�� ����
 *  - HashSet (int initalCapacity) ������ �ʱ�뷮 �� ����Ʈ�� ���ϰ���� ����
 *  - HashSet ( " float loadFactor) �������ʱ� �뷮 �� ������ ���ϰ���� ����
 * 
 * �ֿ� �޼ҵ�
 * boolean add(E e) - ������ ��Ұ� ��Ʈ�� ��ҷμ� �������� �ʴ°�쿡 �߰���
 * void clear()		- �ϴ� ��������
 * boolean contains (Object o)  - ������ ��Ұ� ��Ʈ�� ���ԵǾ� �ִ� �ܿ쿡 true
 * boolean isEmpty()- �̼�Ʈ�� ��Ұ� 1���� ���Ե��� ���� ��쿡 true
 * Iterator<E> iterator() ��Ʈ���� �� ��ҿ� ���� Iterator�� ��ȯ
 * boolean remove (Object o) �����ȿ�Ұ� �� ��Ʈ�� �����ϴ� ��쿡 ��Ҹ� ����
 * int size() ��Ʈ���� ��Ҽ��� ��ȯ   
 * 
 * ArrayList
 * boolean add (E e) - �̸���Ʈ�� ���������� ������ ��Ҹ� ����
 * void add (int index, E element) - �� ����Ʈ ���� ������ ��ġ�� ������ ��Ҹ� ����
 * void clear()		-�� ����
 * E get (int index)-�̸���Ʈ���� 
 * int indexOf(Object o)-������ ��Ұ� �� 
 * boolean isEmpty()
 *    
 */

import java.util.*;
public class CollectionEx1 {

	
	
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
		
		
		
		
		
		
		
	}

}