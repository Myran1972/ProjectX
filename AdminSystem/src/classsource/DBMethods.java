package classsource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBMethods extends Database {
	
	public String getDockByVolumeType(String volType){
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM Dock WHERE VolumeType='" + volType + "'";
				stm = con.createStatement();
				   rs = stm.executeQuery(sql);
				   while(rs.next()){
					   
					   String id = rs.getString("ID");
					   String name = rs.getString("Name");
					   String volumetype = rs.getString("VolumeType");
					   return "ID = " + id + ", Name = "+ name + ", VolumeType = "+ volumetype;
					   
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

	public String getShipVol1(String Name, String ID){
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
	public String getOKTrucks(String shipVolume){
		String truck = shipVolume;
		truck[shipVolume.length()] = '1';
		
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM Trucks WHERE Type='" + truck + "' AND Status='OK' OR Status='Reserv'";
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				while(rs.next()){
					return rs.getString("ID");
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
	public String getDock(String dock_0, String firstDate, String secondDate){
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "SELECT * FROM " + dock_0 + " WHERE Date BETWEEN '" + firstDate + "' AND '" + secondDate + "';";
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				while(rs.next()){
					String date = rs.getString("Date");
					String time = rs.getString("TimeInterval");
					String ship = rs.getString("ShipName");
					return "Date: " + date + " Time: " + time + " ShipName: " + ship;
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
	public void bookDock(String dock_0, String date, String time, String sName, int SID, int PID, String lastName, int PP, String TID, int TP){
		if(hasConnection()){
			Statement stm = null;
			ResultSet rs = null;
			try{
				String sql = "INSERT INTO " + dock_0 + " (Date, TimeInterval, ShipName, ShipID, PersonID, Lastname, PersonPrice, TruckID, TruckPrice)" + 
				"VALUES ('"+ date +"', '"+ time +"', '" + sName + "', "+ SID +", "+ PID +", '"+ lastName +"', "+ PP +", '"+ TID +"', "+ TP+");";
				
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
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
	}
}
