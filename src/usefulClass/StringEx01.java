package usefulClass;
/*
 * String Class
 * - ���ڿ��� �����ϱ� ���� ������ �迭 ������ �ν��Ͻ� ������ �����ص�
 * - ������ ������ �Ű������� �޴� ���ڿ��� ���ڿ� �迭�� ����Ǵ°�
 * 
 * �ֿ� �޼ҵ�
 * 1. char charAt(int index) -������ �ε����� ���ڸ� ��ȯ
 * 2. int compareTo (String anotherString) - 2���� ĳ���� ������ ���������� ��
 * 3. int compareTolgnoreCase (String str) - ��ҹ��� ���о��� ��
 * 4. string concat (String str) ������ ĳ���� ������ �� ĳ���� ������ �������� ����
 * 5. boolean startsWith (String prefix,int toffset) ������ ���λ�� ���۵��� �ƴ���
 * 6. boolean endsWith	(String suffix)		���̻�Ȯ��
 * 7. boolean equalsIgnoreCase (String another String)
 * 8. byte[] getBytes()	- �� ��ü�� ����Ʈ �迭�� ��ȯ����
 * 9. byte[] getBytes(String charsetName)
 * 10. int lastindexOf(int ch)
 * 11. String substring(int beginindex) - ������ ��
 * 12. 
 * 
 * 
 * 
 */
public class StringEx01 {

	public static void main(String[] args) {
		String str = new String("Hello Java!!");
		System.out.println("���� : " + str.length());
		
		char ch = str.charAt(4);
		System.out.println("4��° ���� : " + ch);
		
		System.out.println(str.substring(6,10));//6~10
		System.out.println(str.substring(6)); 	//6~
		
		byte[] by = str.getBytes();
		for(int i = 0 ; i < by.length ; i++) System.out.println((char)by[i]);
		
		
		
	}

}
