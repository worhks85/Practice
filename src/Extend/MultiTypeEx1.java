package Extend;
/*
 * 다형성
 * -여러가지 형태를 가질 수 있는 능력
 * - 하나의 참조변수에 여러 타입의 객체를 참조있음
 *  -즉 조상 타입의 참조 변수로 자손 타입의 객체를 생성
 * 여러개의 클래스가 같은 메시지에 대해서 각자의 방법으로 작용 할 수있는 능력
 * 
 * Up - Casting
 * 자손 타입에서 조상 타입으로 형 변환
 * 자동 형 변환이 됨
 * 
 * down - Casting
 * Up  casting된 참조 변수에서 자손 타입으로 형변환
 * 강제 형 변환을 해줘야함 
 * 
 * instanceof 연산자
 * - ~의 객체라는뜻
 * - 참조 변수가 참조하는 객체의 실제 타입을 체크하는 사용
 * - 결과는 true false 로 나옴
 * 
 * 조상 타입의 배열에 자손들의 객체를 담을 수 있음
 * 
 * 
 * 
 * 
 */
class fruit{}
class apple extends fruit{}
class banana extends fruit{}
public class MultiTypeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
