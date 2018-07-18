import java.util.Scanner;
import java.util.*;

public class squared_Cubed{


	public static void main(String[] args) {
		
		
		char userInput;
		boolean response = false;
		
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
	do {	
		System.out.println("Enter an integer. ");
		int userNum = scnr.nextInt();
		System.out.println("Number \tSquared\tCubed" );
		System.out.println("=======\t=======\t=======");
		for (int i=1; i<=userNum; i++) {
		System.out.println("" + i +"\t "+ Math.pow(i,2) + "\t "+ Math.pow(i,3));
	
		}
	
		 System.out.println("Continue? (y/n): ");

		 userInput = scnr.next().charAt(0);
		 
		if (userInput == 'y') {
			 response = true;
		 }
		else {
		 
			 response = false;
			 System.out.println("Goodbye!");
		}
	}
	while (response == true);


		}
}

