package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class CollectionEx3 {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		
		map.put("�߱�����", "������");
		map.put("�߱�����", "������"); // Ű���� �����ϸ� ����
		
		map.put("�౸����","�⼺��");
		map.put("���� ���׸�", "���缮");
		map.put("���� ������", "�̳���");
		
		System.out.println("���� ���� : " + map.size());
		
		
		Set key = map.keySet();
		for(Iterator it = key.iterator(); it.hasNext();){
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name + "�� �̸��� : " + map.get(name));
			
		}
		
		
		
		
		
	}

}
