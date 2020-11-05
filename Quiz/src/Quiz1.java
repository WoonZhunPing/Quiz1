import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your gender in girl or boy");
			
		String gender = scan.nextLine();
			
		System.out.println("\nEnter your height in feet and inches");
			
		System.out.println("Height in feet : " );
			
		int feet = scan.nextInt();
			
		System.out.println("Height in inches : ");
			
		int inch = scan.nextInt();
			
		int totalInch = ( ( feet*12 ) + inch ) - (5*12) ;
			
		if(gender.contains("boy")) {
			
			System.out.println("\nThe ideal weight for you is " + (50 + (totalInch*6)) + " kg");
			
		} else  {
			
			System.out.println("\nThe ideal weight for you is " + (40 + (totalInch*5)) + " kg");
			
		}
		
	

	}

}
