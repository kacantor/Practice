package Thoughts;
import java.util.Scanner;

public class Run {

	public void Running() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("This program will recreate a calculator in an inconvienent way");
		
		int choice = 1;		
		
		while(choice == 1){
			System.out.println("Please enter your first number");
			int sum = 0;
			int num1 = s.nextInt();
			System.out.println("Please pick a method,  1= +  2= -  3= *  4= /");
			int pick = s.nextInt();
			if(pick<3){
				if(pick==1){
					System.out.println("Please enter your second number");
					int num2 = s.nextInt();
					sum = num1 + num2;
				}
				else{
					System.out.println("Please enter your second number");
					int num2 = s.nextInt();
					sum = num1 - num2;
				}		
				}
			else{
				if(pick==3){
					System.out.println("Please enter your second number");
					int num2 = s.nextInt();
					sum = num1 * num2;
				}
				else{
					System.out.println("Please enter your second number");
					int num2 = s.nextInt();
					sum = num1 / num2;
				}
				
			}  //close for original if else
			System.out.println(sum);
			System.out.println("Calculate more? 1 to continue, else any key");
			choice = s.nextInt();
		}   //close for while loop
		
		
	}
	
}
