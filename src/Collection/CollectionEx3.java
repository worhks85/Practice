package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class CollectionEx3 {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		
		map.put("야구선수", "류현진");
		map.put("야구선수", "류현진"); // 키값이 동일하면 수정
		
		map.put("축구선수","기성룡");
		map.put("남자 개그맨", "유재석");
		map.put("여자 연예인", "이나영");
		
		System.out.println("현재 갯수 : " + map.size());
		
		
		Set key = map.keySet();
		for(Iterator it = key.iterator(); it.hasNext();){
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name + "의 이름은 : " + map.get(name));
			
		}
		
		
		
		
		
	}

}
