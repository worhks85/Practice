package BackJun;

import java.awt.FocusTraversalPolicy;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.imageio.metadata.IIOMetadataFormatImpl;



public class Quiz16466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = 0;
		int sum = 1;
		int tick[] = new int[i];
		
		for ( a= 0 ; a < tick.length; a++) {
			tick[a] = a+1;
		}
		a = 0;
		
		while (true) {
			a++;
			int res = sc.nextInt();
			System.out.println(res);
			for (int z = 0 ; z > tick.length ; z++) {
				System.out.println(z);
				if (tick[z] == res){
					sum += 1;
					System.out.println(tick[z]);
					break;
					
				}

			}
			System.out.println(sum);
			break;
		}
	}

}
