package edu.wit.dcsn.comp1050.lab03;
import java.util.Scanner;

/*
* Tung Pham
* Comp 1050 - Computer Science II
* Lab 3: Time
* Summer, 2018
*/

public class TestTime {
	private static void display(Time checkedTime) { //use for display
		System.out.printf("%nThe time using setTime function in 12hours format: %s",checkedTime.getTime12());
		System.out.printf("%nThe time using setTime function in 24hours format: %s",checkedTime.getTime24());
		
	}
	public static void main(String[] arg) {
			//Initialize
			String choice;
			Time time;
			int hours;
			int minutes;
			String amPmInput;
			Scanner input= new Scanner(System.in);
		
			//Loop until quit
			do {
			System.out.print("\n[1] 12 hours clock\n[2] 24 hours clock\n[Q] quit\nPlease enter your choice: ");
			choice=input.next();
			time=new Time(); //Create instance of Time Object
		
			//Switch
			switch(choice) {
			case "1":
				//Prompt for user's input
				do {
				System.out.print("Please enter the hour number (1-12): ");
				hours=input.nextInt();
				System.out.print ("Please enter the minute number (0-59): ");
				minutes=input.nextInt();
				System.out.print("Please enter whether AM or PM: ");
				amPmInput=input.next();
				}while((hours<1 || hours>12) && time.isValid(hours, minutes));
				time.setTime(hours, minutes, amPmInput.equalsIgnoreCase("AM")); //Call setTime method in class Time
			
				//Print data in both format
				display (time);
				break;
			
			case "2":
				//Prompt for user's input
				do {
					System.out.print("Please enter the hour number (0-23): ");
					hours=input.nextInt();
					System.out.print("Please enter the minute number (0-59): ");
					minutes=input.nextInt();
				} while(!time.isValid(hours, minutes));
				time=new Time(hours,minutes); //Create new Instance of Time and invoke the 2-args constructor
				//Print data in both format
				display(time);
				break;
		
			//Exiting case
			case "Q":
				System.out.print("Exiting!");
				break;
			case "q":
				System.out.print("Exiting!");
				break;
			//Default case	
			default:
				System.out.print("Wrong input!!");
			}
		} while(!choice.equalsIgnoreCase("Q")); //Condition of Looping
		input.close(); //Close Scanner
	}
}
