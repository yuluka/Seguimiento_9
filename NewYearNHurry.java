import java.util.Scanner;

public class NewYearNHurry {
	
	private static Scanner in = new Scanner(System.in);
	private static int n;
	private static int k;
	private static int contestMins;
	private static int problems = 0;
	
	public static void main(String[] args) {
		String nk = in.nextLine();
		String[] parts = nk.split(" ");
		
		n = Integer.parseInt(parts[0]);
		k = Integer.parseInt(parts[1]);
		contestMins = 4*60;
		
		int time = contestMins - k;
		calculateProblems(time);
		System.out.println(problems);
	}
	
	public static void calculateProblems(int time) {
		for (int i = 0; i < n; i++) {
			int problemTime = 5*(i+1);
			
			if(problemTime <= time) {
				time -= problemTime;
				problems++;
			}
		}
	}

}
