package classsource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBMethods extends Database {
	public static DBMethods methods = new DBMethods();
	public String getDockByVolumeType(String volType){ //uppdaterad mr
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				//mr: String sql = "SELECT * FROM Dock WHERE VolumeType='" + volType + "'";
				String sql = "SELECT * FROM TypeTable WHERE VolumeType='" + volType + "'";
				stm = con.createStatement();
				   rs = stm.executeQuery(sql);
				   while(rs.next()){
					   
					   String id = rs.getString("DockID");
					   //mr: String name = rs.getString("Name");
					   String volumetype = rs.getString("VolumeType");
					   //return "ID = " + id + ", Name = "+ name + ", VolumeType = "+ volumetype;
					   String name = "Kaj "+id;
					   return name;
					   
				   }
			   }catch(SQLException sqle){
				   System.err.println(sqle.getMessage());
			   }finally{
				   try {
					rs.close();
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			   }
			
		}
		return null;
	}

	public String getShipVol1(String Name, String ID){ //ingen uppdatering beh�vs
		if(hasConnection()){
			String sql = "SELECT VolumeType FROM Ships WHERE Name='" + Name + "' AND ID='" + ID + "';";
			Statement stm = null;
			ResultSet rs = null;
			try{
				stm = con.createStatement(); 
				rs = stm.executeQuery(sql);
				while(rs.next()){
						String VolT = rs.getString("VolumeType");
						return VolT;
						//System.out.println(rs.getString("VolumeType"); //getDockByVolumeType(rs.getString("VolymType");
				   }
				
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}finally{
				try{
					rs.close();
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	public String getOKTrucks(String shipVolume){ //ingen uppdatering beh�vs, men det beh�vs JOIN f�r truckstatus
		
		String  truck = getTruckVol(shipVolume);
		
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM Trucks WHERE Type='" + truck + "' AND Status='OK'";
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				while(rs.next()){
					int id = rs.getInt("ID");
					String type = rs.getString("Type");
					String status = rs.getString("Status");
					return "ID:" + id + " Type:" + type + " Status:" + status;
				}
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}finally{
				try{
					rs.close();
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	//g�r om nedan helt, nytt namn mm, se nedanf�r /mr
//	public String getDock(String dock_0, String firstDate, String secondDate){ 
//		if(hasConnection()){
//			Statement stm = null;
//			ResultSet rs = null;
//			try{
//				String sql = "SELECT * FROM " + dock_0 + " WHERE Date BETWEEN '" + firstDate + "' AND '" + secondDate + "';";
//
//				stm = con.createStatement();
//				rs = stm.executeQuery(sql);
//				while(rs.next()){
//					String date = rs.getString("Date");
//					String time = rs.getString("TimeInterval");
//					String ship = rs.getString("ShipName");
//					return "Date: " + date + " Time: " + time + " ShipName: " + ship;
//				}
//			}catch(SQLException sqle){
//				System.err.println(sqle.getMessage());
//			}finally{
//				try{
//					rs.close();
//					stm.close();
//				}catch(SQLException e){
//					e.printStackTrace();
//				}
//			}
//		}
//		return null;
//}

	public List<String> getReport(String firstDate, String secondDate){ //ny pga uppdatering /mr

		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM Ship_Booked WHERE Date BETWEEN '" + firstDate + "' AND '" + secondDate + "';";
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				List<String> array = new ArrayList<String>();
				while(rs.next()){
					String date = rs.getString("Date");
					String ship = rs.getString("ShipName");
					int shipId = rs.getInt("ShipID");					
					int dock = rs.getInt("DockID_00");
					String time = "00-08";
					if(rs.wasNull()){
						dock = rs.getInt("DockID_08");
						time = "08-16";
						if(rs.wasNull()){
							dock = rs.getInt("DockID_16");
							time = "16-00";
						}

					}//gjorde som Kim hade gjort f�rst (med return), men d� kan man bara f� f�rsta posten, kan man returnera n�got b�ttre?
					//System.out.println("Date: " + date + " Time: " + time + " Dock: " + dock + " ShipID: " + shipId + " ShipName: " + ship);
					String test = "Date: " + date + " Time: " + time + " Dock: " + dock + " ShipID: " + shipId + " ShipName: " + ship;
					array.add(test);	
				return array;
				}
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}finally{
				try{
					rs.close();
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}

		return null;	

	}
	
	//mr: public void bookDock(String dock_0, String date, String time, String sName, int SID, int PID, String lastName, int PP, String TID, int TP){
	public void bookDock(int dockId, String date, String time, String sName, int SID){ //uppdaterad mr
		if(hasConnection()){
			Statement stm = null;
			//mr: ResultSet rs = null;
			String sql = null;
			try{
				//mr:String sql = "INSERT INTO " + dock_0 + " (Date, TimeInterval, ShipName, ShipID, PersonID, Lastname, PersonPrice, TruckID, TruckPrice)" + 
				//"VALUES ('"+ date +"', '"+ time +"', '" + sName + "', "+ SID +", "+ PID +", '"+ lastName +"', "+ PP +", '"+ TID +"', "+ TP+");";
				if(time.equals("00-08")){
					sql = "INSERT INTO Ship_Booked" + " (Date, DockID_00, ShipName, ShipID)" + 
							"VALUES ('"+ date +"', '"+ dockId +"', '" + sName + "', "+ SID +");";
				}
				else if(time.equals("08-16")){
					sql = "INSERT INTO Ship_Booked" + " (Date, DockID_08, ShipName, ShipID)" + 
							"VALUES ('"+ date +"', '"+ dockId +"', '" + sName + "', "+ SID +");";
				}
				else{
					sql = "INSERT INTO Ship_Booked" + " (Date, DockID_16, ShipName, ShipID)" + 
							"VALUES ('"+ date +"', '"+ dockId +"', '" + sName + "', "+ SID +");";
				}
				
				stm = con.createStatement();
				stm.executeUpdate(sql); //�ndrad inget resultset eller Query vid INSERT /mr
				
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}finally{
				try{
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void clearTestBookDock(int dockId, String date, String time, String sName, int SID){ // bara f�r att kunna �terst�lla efter test av INSERT /mr
		String sql = "DELETE FROM Ship_Booked WHERE ShipID = '" + SID + "'";
		Statement stm = null;
		try{
			stm = con.createStatement();
			stm.executeUpdate(sql);
			}catch(Exception e){
			System.err.println(e.getMessage());
			}finally{
				try{
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
	}
	public void addPeps(){
		
	}
	public String getPeps(String ID, String LastName){
		
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM Staff WHERE ID='"+ ID +"' AND Lastname='"+ LastName + "';";
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				while(rs.next()){
					String PID = rs.getString("ID");
					String Name = rs.getString("Name");
					String LName = rs.getString("LastName");
					String License = rs.getString("License");
					String Schedule = rs.getString("Schedule");
					String Status = rs.getString("Status");
					return "ID: " + PID + "Name: " + Name + "LastName: " + LName + "License: " + License + "Schedule: " + Schedule + "Status: " + Status; 
				}
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}finally{
				try{
					rs.close();
					stm.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	
	public String getTruckVol(String volume){ //n�e... varf�r? Finns i TypeTable /mr
		
		switch(volume){
			case "A005":
				return "A001";
			case "AA07":
				return "AA01";
			case "B005":
				return "B001";
			case "BB07":
				return "BB01";
			case "C005":
				return "C001";
			case "CC07":
				return "CC01";
			case "CCC5":
				return "CCC1";
			case "K007":
				return "K001";
		}
		return null;
	}
}
