package NonGUI;

import java.util.Scanner;

import classsource.DBMethods;
import classsource.DBUtils;
import classsource.Database;

public class MainNonGUI {

	public static void main(String[] args) {
		DBMethods dbm = new DBMethods();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do{
			menu();
			choice = sc.nextInt();
			switch(choice){
			
			case 1: //booking
				System.out.println("What dock?");
				int dockId = sc.nextInt();
				sc.nextLine();
				System.out.println("Date YYYY-MM-DD");
				String date = sc.nextLine();
				System.out.println("Time hh-hh");
				String time = sc.nextLine();
				System.out.println("ShipName");
				String sName = sc.nextLine();
				System.out.println("ShipID");
				int SID = sc.nextInt();
				sc.nextLine();
				dbm.bookDock(dockId, date, time, sName, SID);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Thank you and Good bye!");
				break;
			default:
				System.out.println("Wrong choice! Try again!");
			break;
			}
			
		}while(choice!=6);
		
		

	}
	
	public static void menu(){
		System.out.println("Booking Ships");
		System.out.println("1. Booking");
		System.out.println("2. Report");
		System.out.println("3. Staff");
		System.out.println("4. Trucks");
		System.out.println("5. Ships");
		System.out.println("6. Quit");
	}

}

