package classsource;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;
//import org.mockito.Mockito;

public class DBMethodsTest {

	DBMethods dbm;
	DBMethods db_mock = Mockito.spy(DBMethods.class);
	
	@Before
	public void setup(){
		dbm = new DBMethods();		
	}
	
	String result;
	
	//@Test
	//public void testGetReport() {
	//	dbm.getReport("2016-04-20", "2016-04-20");
	//}
	//@Ignore //ändra Ignore mellan dessa två om du vill lägga till och se det och sen kan du ta bort
	@Test
	public void testBookDock(){
		dbm.bookDock(101, "2016-04-20", "08-16", "Tagpad", 153);
	}
	@Ignore //ändra Ignore mellan dessa två om du vill lägga till och se det och sen kan du ta bort
	
	@Test
	public void testClearTestBookDock(){
		dbm.clearTestBookDock(101, "2016-04-20", "08-16", "Tagpad", 153);
	}

	public void getDockByVolyme() {
		result = dbm.getDockByVolumeType("B005");
		System.out.println(result);
		assertEquals(result, "ID = 2, Name = Kaj 201, VolumeType = B005");
		assertNotEquals(result, "ID = 2, Name = Kaj 201, VolumeType = B001");
		result = dbm.getDockByVolumeType("B002");
		System.out.println(result);
		assertNull(result);			 
		}
		@Test
	public void getshipvol(){
		result = dbm.getShipVol1("Talane", "1");
		System.out.println(result);
		assertEquals("A005", result);
		result = dbm.getShipVol1("", "");
		System.out.println(result);
		assertEquals(null, result);
		result = dbm.getShipVol1("Talane", "");
		System.out.println(result);
		assertEquals(null, result);
			
			
		}
		@Test
		public void getReport(){
			
			/*public void OutputStreamWriter_Closes_OutputStream_on_Close()
			throws IOException {
		OutputStream mock = mock(OutputStream.class);
		OutputStreamWriter osw = new OutputStreamWriter(mock);
		osw.close();
		verify(mock).close();
	}
			 * */

			//Mockito.doNothing().when(db).getReport("0000-00-00", "2016-09-13");
			db_mock.getReport("0000-09-13", "2020-09-13");
			assertEquals("", "");
		}

		@Test 
		public void getOKTrucksSuccsses(){
			result = dbm.getOKTrucks("A005");
			System.out.println(result);
			//assertEquals("1", result);
		} 
		//@Test //Skall testa denna på wtt annat sätt
		//public void getOKTrucksFailed(){
		//result = dbm.getOKTrucks("AA05");
		//System.out.println(result);
		//assertEquals(, result);
		//}
		@Test
		public void getvol(){
			result = dbm.getTruckVol("A005");
			System.out.println(result);
		}
	}



