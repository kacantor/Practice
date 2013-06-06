package Thoughts;
import java.util.Scanner;

public class Menu {

	public void MenuList() {
		
		Scanner s = new Scanner(System.in);
		
		
		
		int choice = 1;		
		
		while(choice == 1){

			System.out.println("Please choose a function");
			System.out.println("1=Calculator");
			System.out.println("2=Calender");
			System.out.println("3=Journal");
			System.out.println("4=Phone Book");
			
			int pick = s.nextInt();
			
			if(pick<3){
				if(pick==1){
					Run r = new Run();
					r.Running();
				}
				else{
					Calendar c = new Calendar();
					c.CalendarBook();
				}		
				}
			else{
				if(pick==3){
					Journal j = new Journal();
					j.JournalBook();
				}
				else{
					Phone p = new Phone();
					p.PhoneBook();
				}
				
				} //closes last if else
			System.out.println("Use Another App, Yes-1  No-2");
			choice = s.nextInt();
		
			} // closes while loop
		
	}
	
}
