package BackJun.stack;


import java.util.*;
public class quiz1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		ArrayList<String> ans = new ArrayList<String>();
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int m = 1;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			st.push(i);
			ans.add("+");
			while (!st.empty() && st.peek() == a[m]) {
				st.pop();
				ans.add("-");
				m++;
			}
		}

		if (st.empty()) {
			for (String s : ans) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}

	}
}


