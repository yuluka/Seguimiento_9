import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExactSum {

	private static Scanner in = new Scanner(System.in);
	private static ArrayList<Integer> prices;
	
	public static void main(String[] args) {
		int books = in.nextInt();
		prices = new ArrayList<>();
		
		for (int i = 0; i < books; i++) {
			int aux = in.nextInt();
			prices.add(aux);
		}
		Collections.sort(prices);
		
		int peterMoney = in.nextInt();
		int[] bookPairs = new int[] {0,0};
		
		for (int i = 0; i < prices.size(); i++) {
			if(prices.get(i) <= peterMoney/2) {
				int searchingNum = peterMoney-prices.get(i);
				int index = binarySearch(searchingNum);
				
				if(index != -1) {
					if(bookPairs[1] == 0 && bookPairs[0]== 0) {
						bookPairs[0] = prices.get(i);
						bookPairs[1] = prices.get(index);
					} else {
						int difference1 = bookPairs[1]-bookPairs[0];
						int difference2 = prices.get(index)-prices.get(i);
						
						if(difference1 >= difference2) {
							bookPairs[0] = prices.get(i);
							bookPairs[1] = prices.get(index);
						}	
					}
					
					/**int difference1 = bookPairs[1]-bookPairs[0];
					int difference2 = prices.get(index)-prices.get(i);
					
					if(difference1 >= difference2) {
						bookPairs[0] = prices.get(i);
						bookPairs[1] = prices.get(index);
					}*/					
				}
				
			} else {
				break;
			}
		}
		
		System.out.println("Peter should buy books whose prices are " + bookPairs[0]
				+ " and " + bookPairs[1] + ".");
	}
	
	public static int binarySearch(int searchingNum) {
		int index = -1;
		
		int beg = 0;
		int end = prices.size()-1;
		
		while(beg <= end) {
			int middleI = (end+beg)/2;
			
			if(searchingNum == prices.get(middleI)) {
				index = middleI;
				break;
			} else if(searchingNum < prices.get(middleI)) {
				end = middleI-1;
			} else {
				beg = middleI+1;
			}
		}
		
		return index;
	}
}
