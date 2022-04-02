import java.util.Scanner;

public class TeamComposition {

	private static Scanner in = new Scanner(System.in);
							
	public static void main(String[] args) {
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int a = in.nextInt(); //programmers
			int b = in.nextInt(); //mathematicians 
			
			calculateTeams(a, b);
		}
	}
	
	public static void calculateTeams(int a, int b) {
		int teams = (a+b)/4;
		int pairs = 0;
		
		if(a < b) {
			pairs = a;
		} else {
			pairs = b;
		}
		
		if(pairs < teams) {
			System.out.println(pairs);
		} else {
			System.out.println(teams);
		}
	}
}
