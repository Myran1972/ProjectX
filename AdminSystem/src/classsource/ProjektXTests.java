package classsource;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjektXTests{
	DBMethods projektx;
	Database db;
	String result;
	String result1;
	String ID;
	@Before
	public void setup(){
		projektx = new DBMethods();
		db = new Database();
	}
	//@Test
	//public void hasConnection(){
		
	//}
	//@Test
	public void getDockByVolyme() {
		result = projektx.getDockByVolumeType("B005");
		System.out.println(result);
		assertEquals(result, "ID = 2, Name = Kaj 201, VolumeType = B005");
		assertNotEquals(result, "ID = 2, Name = Kaj 201, VolumeType = B001");
		result1 = projektx.getDockByVolumeType("B002");
		System.out.println(result1);
		assertNull(result1);
		 
	}
	//@Test
	public void getshipvol(){
		result = projektx.getShipVol1("Talane", "1");
		System.out.println(result);
		assertEquals("A005", result);
		result = projektx.getShipVol1("", "");
		System.out.println(result);
		assertEquals(null, result);
		result = projektx.getShipVol1("Talane", "");
		System.out.println(result);
		assertEquals(null, result);
		
		
	}
	@Test
	public void getDock(){
		result1 = projektx.getDock("Dock_1", "00-00-00", "95-09-13");
		System.out.println(result);
	}



}
