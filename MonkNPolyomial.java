import java.util.ArrayList;
import java.util.Scanner;

public class MonkNPolyomial {

	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = in.nextInt();	
		
		for (int i = 0; i < t; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			int k = in.nextInt();
			
			int x = findX(A, B, C, k);
			
			System.out.println(x);
		}
	}
	
	public static int findX(int A, int B, int C, int k) {
		ArrayList<Integer> a = createArraylist(k);
		int x = k/2;
		int index = binarySearch(x, a);
		
		for (int i = 0; i < a.get(index); i++) {
			int kaux = A*(a.get(i)*a.get(i))+B*a.get(i)+C;
			
			if(kaux >= k) {
				x = a.get(i);
				break;
			}
		}
		
		return x;
	}
	
	public static ArrayList<Integer> createArraylist(int k) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 0; i < k; i++) {
			a.add(i);
		}
				
		return a;
	}
	
	public static int binarySearch(int goal, ArrayList<Integer> a) {
		int index = -1;
		
		int beg = 0;
		int end = a.size()-1;
		
		while(beg <= end) {
			int mid = (end+beg)/2;
			
			if(goal == a.get(mid)) {
				index = mid;
				break;
			} else if(goal < a.get(mid)) {
				end = mid-1;
			} else {
				beg = mid+1;
			}
		}
		
		return index;
	}
}
