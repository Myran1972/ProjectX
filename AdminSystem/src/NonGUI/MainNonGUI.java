package NonGUI;

import java.util.List;
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
				sc.nextLine();
				System.out.println("ShipName");
				String sName = sc.nextLine();
				System.out.println("ShipID");
				int SID = sc.nextInt();
				sc.nextLine();
				int dockId = dbm.getDockByVolumeType(dbm.getShipVol1(sName, SID));
		
				System.out.println("Date YYYY-MM-DD");
				String date = sc.nextLine();
				System.out.println("Time hh-hh");
				String time = sc.nextLine();
				List<String> booked = dbm.getReport(date, date);
				boolean available = true;
				for(int i = 0; i<booked.size(); i++){
					if(booked.get(i).contains(time) & booked.get(i).contains(Integer.toString(dockId))){
						System.out.println("Already booked that time and date, please try again!");
						available = false;
						break;
					}						
				}
				if(available){
					dbm.bookDock(dockId, date, time, sName, SID);
					System.out.println("The ship is booked!");
				}
				break;
			case 2: //report
				sc.nextLine();
				System.out.println("First Date YYYY-MM-DD");
				String firstDate = sc.nextLine();
				System.out.println("Second Date YYYY-MM-DD");
				String secondDate = sc.nextLine();
				for(String s : dbm.getReport(firstDate, secondDate))
					System.out.println(s);
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

