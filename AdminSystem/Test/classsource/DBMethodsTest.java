package classsource;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.mockito.Mockito;

import junit.framework.Assert;
//import org.mockito.Mockito;

public class DBMethodsTest {

	DBMethods dbm;
	//DBMethods db_mock = Mockito.spy(DBMethods.class);
	
	@Before
	public void setup(){
		dbm = new DBMethods();		
	}
	
	Integer result;
	List<String> result1;
	String result2;
	//@Test
	//public void testGetReport() {
	//	dbm.getReport("2016-04-20", "2016-04-20");
	//}
	//@Ignore //ändra Ignore mellan dessa två om du vill lägga till och se det och sen kan du ta bort
	//@Test
	//@Ignore //ändra Ignore mellan dessa två om du vill lägga till och se det och sen kan du ta bort
	
	//@Test
	public void getDockByVolyme() {
		result = dbm.getDockByVolumeType("B005");
		System.out.println(result);
		assertEquals(result, (Integer) 201);
		result = dbm.getDockByVolumeType("B002");
		System.out.println(result);
		assertNull(result);			 
		}
	//@Test
	public void getshipvol(){
		result2 = dbm.getShipVol1("Talane", 1);
		System.out.println(result2);
		assertEquals("A005", result2);
		/**
		result2 = dbm.getShipVol1("", (Integer) null);
		System.out.println(result2);
		assertEquals(null, result2);
		result2 = dbm.getShipVol1("Talane", (Integer) "");
		System.out.println(result2);
		assertEquals(null, result2);
		**/
		}
	//@Test 
	public void getOKTrucks(){
		dbm.getOKTrucks("A005");
		System.out.println(result);
			//assertEquals("1", result);
	} 
		//@Test //Skall testa denna på wtt annat sätt
		//public void getOKTrucksFailed(){
		//result = dbm.getOKTrucks("AA05");
		//System.out.println(result);
		//assertEquals(, result);
		//}
	//@Test
	public void getvol(){
		result2 = dbm.getTruckVol("A005");
		System.out.println(result);
	}
	//@Test
	public void TestGetPeps(){
		result2 = dbm.getPeps("304", "Floren");
		System.out.println(result2);
		assertEquals(result2, "ID: 304 Name: Petra LastName: Floren License: K Schedule: S Status: 50%");
	}
	// Väntar på att metoderna ska bli klara.
	@Test
	public void TestAddPeps(){
		dbm.addPeps("Honey", "Booboo", "A", "S", "100%");
		//System.out.println(result2);
	}
	//@Test

	//public void TestRemovePeps(){
		//result2 = dbm.removePeps(305, "Booboo");
		//System.out.println(result2);
	//}
	//@Test
	//public void TestAddTrucks(){
		//result2 = dbm.addTrucks("A001", "OK");;
		//System.out.println(result2);
	//}
	//@Test
	//public void TestRemoveTrucks(){
		//result2 = dbm.removeTrucks(288, "A001");
		//System.out.println(result2);
	//}
	

	public void TestRemovePeps(){
		//result2 = dbm.removePeps(305, "Booboo");
		System.out.println(result2);
	}
	


}



