package ArrayMethod;

public class DimentionArray {

	public static void main(String[] args) {
		//Ȧ�� ������ , 5�� ������
		//����,����,�밢���� ���� ��� ���� ��
		int arr[][] = new int [5][5];
		int i = 0 , j =2; //1. ù��°�� ��� ������ ����
		int co = 1;
		while (co<=25) {
			arr[i][j]= co;
			int oldi = i;
			int oldj =j;
			
			i--; j++;// ������ �밢�� ���� �̵�
			
			if (i < 0 ) i =4; //3. ���� ������ �Ǹ� �� ���� �ִ������� �̵�
			if ( j> 4 ) j =0; //4. ���� �迭�� ���� ����� 0���� �̵�
			if (arr[i][j] != 0 ) {
				i = oldi;
				j = oldj;	//���� ��ġ�� �̵���Ų��.
				i++;			//���� �ϳ� ������Ų��.
				
			}
			co++;
			
		}
		for (i = 0; i<5 ;++i) {
			for(j = 0 ; j <5;++j) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
		
				
		

		
		
		
		
		
		
		
		
	}

}
