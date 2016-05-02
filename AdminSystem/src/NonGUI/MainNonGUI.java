package NonGUI;

import java.util.List;
import java.util.Scanner;

import classsource.DBMethods;
import classsource.DBUtils;
import classsource.Database;

public class MainNonGUI {
	static Scanner sc = new Scanner(System.in);
	static DBMethods dbm = new DBMethods();
	
	public static void main(String[] args) {
		
		int choice = 0;
		int subChoice = 0;
		String option;
		
		do{
			menu();
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
			
			case 1: //booking
				bookShip();
				break;
			case 2: //report
				getReport();
				break;
			case 3: //staff
				option = "Staff";
				
				do{
					subMenu(option);
					subChoice = sc.nextInt();
					sc.nextLine();
					switch(subChoice){
					
					case 1: //search
						searchStaff();
						break;
						
					case 2: //add
						addStaff();
						break;
						
					case 3: //remove
						removeStaff();
						break;
						
					case 4: //return
						break;
						
					default:
						System.out.println("Wrong choice! Try again!");
					break;
					}
					
				}while(subChoice!=4);
				
				break;
			case 4: //trucks
				sc.nextLine();
				option = "Trucks";
				do{
					subMenu(option);
					subChoice = sc.nextInt();
					sc.nextLine();
					switch(subChoice){
					
					case 1: //search finns bara f�r ok truckar och du kan bara f� en - g�r om som getReport
						getOkTrucks();
						break;
						
					case 2: //add
						addTrucks();
						break;
						
					case 3: //remove
						removeTrucks();
						break;
						
					case 4: //return
						break;
						
					default:
						System.out.println("Wrong choice! Try again!");
					break;
					}
					
				}while(subChoice!=4);
				break;
				
			case 5: //ships
				sc.nextLine();
				option = "Ships";
				
				break;
			case 6:
				System.out.println("Thank you and Good bye!");
				break;
			default:
				System.out.println("Wrong choice! Try again!");
			break;
			}
			
		}while(choice!=6);
		
		sc.close();

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
	
	public static void subMenu(String option){
		System.out.println(option);
		System.out.println("1. Search ");
		System.out.println("2. Add");
		System.out.println("3. Remove");
		System.out.println("4. Go to main menu");
	}

	public static void bookShip(){ 
		System.out.println("ShipName");
		String sName = sc.nextLine();
		System.out.println("ShipID");
		int SID = sc.nextInt();
		sc.nextLine();
		try{
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
		}catch(NullPointerException e){
			System.out.println("The ship doesn't exist in the database. Please add ship or try again!");
		}
	}
	
	public static void getReport(){
		System.out.println("First Date YYYY-MM-DD");
		String firstDate = sc.nextLine();
		System.out.println("Second Date YYYY-MM-DD (Leave it empty to get First Date)");
		String secondDate = sc.nextLine();
		if(secondDate.equals("")){
			secondDate = firstDate;
		}
		for(String s : dbm.getReport(firstDate, secondDate))
			System.out.println(s);
	}
	
	public static void searchStaff(){
		System.out.println("Enter ID");
		String ID = sc.nextLine(); //Kim, varf�r String?
		System.out.println("Enter lastname");
		String lastName = sc.nextLine();
		System.out.println(dbm.getPeps(ID, lastName));
	}
	
	public static void addStaff(){
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter lastname");
		String familyName = sc.nextLine();
		System.out.println("Enter license type");
		String license = sc.nextLine();
		System.out.println("Enter schedule (MF/LS/S)");
		String schedule = sc.nextLine();
		System.out.println("Enter status");
		String status = sc.nextLine();
		dbm.addPeps(name, familyName, license, schedule, status); 
//		Exception in thread "main" java.lang.NullPointerException
//		at classsource.DBMethods.addPeps(DBMethods.java:247)
//		at NonGUI.MainNonGUI.main(MainNonGUI.java:88)
		//anv�nd inte resultset vid insert, tror det �r det, on�digt oavsett
		System.out.println("Staff added!");
	}
	
	public static void removeStaff(){
		System.out.println("Enter ID");
		int PID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter lastname");
		String lastname = sc.nextLine();
		dbm.removePeps(PID, lastname);
		System.out.println("Staff removed!");
	}
	
	public static void getOkTrucks(){
		System.out.println("Enter ship volume");
		String shipVolume = sc.nextLine(); 
		System.out.println(dbm.getOKTrucks(shipVolume));
	}
	
	public static void addTrucks(){
		System.out.println("Enter truck type");
		String type = sc.nextLine();
		System.out.println("Enter status");
		String status = sc.nextLine();
		dbm.addTrucks(type, status);
//		Exception in thread "main" java.lang.NullPointerException
//		at classsource.DBMethods.addTrucks(DBMethods.java:322)
//		at NonGUI.MainNonGUI.main(MainNonGUI.java:137)
		//anv�nd inte resultset vid insert, tror det �r det, on�digt oavsett
		System.out.println("Truck added!");
	}
	
	public static void removeTrucks(){
		System.out.println("Enter ID");
		String ID = sc.nextLine();
		sc.nextLine(); // ska vi ha String?
		System.out.println("Enter type");
		String truckType = sc.nextLine();
		dbm.removeTrucks(ID, truckType);
		System.out.println("Truck removed!");
	}
	
	public static void searchShip(){
		
	}
	
	public static void addShip(){
		
	}
	
	public static void removeShip(){
		
	}
}

