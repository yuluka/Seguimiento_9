import java.util.Arrays;
import java.util.Scanner;

public class GamerHemose {
	
	private static Scanner in = new Scanner(System.in);
	private static int[] damages;
		
	public static void main(String[] args) {
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int H = in.nextInt();
			
			int[] damages = enterDamages(n);
			System.out.println(evaluateMovements(H, damages));
		}
	}
	
	public static int[] enterDamages(int n) {
		damages = new int[n];
		
		for (int i = 0; i < n; i++) {
			damages[i] = in.nextInt();
		}
		
		return damages;
	}
	
	public static int evaluateMovements(int H, int[] damages) {
		Arrays.sort(damages);
		int movements = 0;
		
		while(H > 0) {
			H -= damages[damages.length-1];
			movements++;
			
			if(H > 0) {
				H -= damages[damages.length-2];
				movements ++;
			}
		}
		
		return movements;
	}
}
