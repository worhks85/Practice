package BackJun.function;

class Test{
	long sum(int[] a) {
		long res = 0;
		for (int i : a) {
			res += i;
		}
		return res;
	}
}

public class Quiz15596 {

	public static void main(String[] args) {
		Test tes = new Test();
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(tes.sum(a));
		

	}

}
