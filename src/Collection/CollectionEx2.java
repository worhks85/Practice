 package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionEx2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add ("���缮");
		list.add ("������");
		list.add ("����");
		list.add ("������");
		list.add ("����");
		list.add(1, "�ڸ��");


		for (Iterator it = list.iterator(); it.hasNext();) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		
		for (int i=0 ;i<list.size() ; ++i) {
			Object obj = list.get(i);
			String name  = (String) obj;
			System.out.println(name);
		}
		
		
		
		
	}

}
