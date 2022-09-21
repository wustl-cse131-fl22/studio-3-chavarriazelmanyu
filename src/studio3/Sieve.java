package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);

		System.out.println("What number would you like to go until?");
		int max = in.nextInt();

		int [] numbers = new int [max];		

		for (int i = 1; i < (max+1); i++) { 
			numbers[i-1] = i ;	
		}
		for (int i = 1; i < (max+1); i++) {
		
					
			if (i%i!=0)
					if ((i%2 != 0) && (i%3 != 0)) {
						System.out.println(numbers[i-1]);
						
						
			}
		}
		
	}
}


