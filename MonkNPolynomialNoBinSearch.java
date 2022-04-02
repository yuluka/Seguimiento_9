import java.util.Scanner;

public class MonkNPolynomialNoBinSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			int k = in.nextInt();
			
			System.out.println(calculateX(A, B, C, k));
		}
	}
	
	public static int calculateX(int A, int B, int C, int k) {
		for (int i = 0; i < (k/2); i++) {
			int kaux = A*(i*i)+B*i+C;
			
			if(kaux >= k) {
				return i;
			}
		}
		
		return 0;
	}

}
