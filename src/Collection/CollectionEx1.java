package Collection;
/*
 * Java Collection
 * - 멤버 객체들을 제어/관리 하기 위한 클래스
 * - 배열과 같이 멤버객체를 관리하기 위한 클래스들을 통틀어 이르는 말
 * - 사용하는 목적은 배열과 같지만, 제공하는 기능이 풍부
 * 
 * Collection Object
 * 여러개의 요소를 묶어 하나의 객체로 만든 것을 의미, 컨테이너라고 부름
 * 
 * Collection Framework
 * 컬렉선 클래스들과 인터페이스들의 집합을 통틀어 일컫는 말
 * 
 * List		( java.util.List )
 * - 순서가 있는 데이터의 집합
 * - 데이터 중복 허용
 * - 가변 길이를 가짐
 * 주요 클래스 - ArrayList, LinkedList, Vector 
 * 
 * Map		(java.util.Map)
 * - key와 value 쌍으로 이루어진 데이터의 집합
 * - key값 중복 불가, value 중복 허용
 * - 고유의 값인 key값을 통해 key와 연결된 객체들을 관리
 * 주요 클래스 - HashMap, HashTable , TreeMap
 * 
 * Set 		(java.util.Set)
 * - 순서 유지가 필요없는 데이터의 집합
 * - 데이터 중복 불가
 * 주요 클래스 - HashSet, TreeSet
 * 
 * 
 * 생성자
 *  - HashSet() 디폴트의 초기용량 (16) 및 부하계수 (0.75)를 가짐
 *  - HashSet (int initalCapacity) 지정된 초기용량 및 디폴트의 부하계수를 가짐
 *  - HashSet ( " float loadFactor) 지정된초기 용량 및 지정된 부하계수를 가짐
 * 
 * 주요 메소드
 * boolean add(E e) - 지정된 요소가 세트의 요소로서 존재하지 않는경우에 추가함
 * void clear()		- 싹다 지워버림
 * boolean contains (Object o)  - 지정된 요소가 세트에 포함되어 있는 겨우에 true
 * boolean isEmpty()- 이세트에 요소가 1개도 포함되지 않은 경우에 true
 * Iterator<E> iterator() 세트내의 각 요소에 대한 Iterator를 반환
 * boolean remove (Object o) 지정된요소가 이 세트에 존재하는 경우에 요소를 삭제
 * int size() 세트내의 요소수를 반환   
 * 
 * ArrayList
 * boolean add (E e) - 이리스트의 마지막으로 지정된 요소를 삽입
 * void add (int index, E element) - 이 리스트 내의 지정된 위치로 지정된 요소를 삽입
 * void clear()		-다 지움
 * E get (int index)-이리스트내의 
 * int indexOf(Object o)-지정된 요소가 이 
 * boolean isEmpty()
 *    
 */

import java.util.*;
public class CollectionEx1 {

	
	
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
		
		
		
		
		
		
		
	}

}