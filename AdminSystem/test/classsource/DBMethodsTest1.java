package classsource;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class DBMethodsTest1 {
	
	DBMethods dbm;
	
	@Before
	public void setup(){
		dbm = new DBMethods();		
	}
	
	String result;
	List<String> resultList;
	
	@Test
	public void testGetReport(){
		resultList = dbm.getReport("00-00-00", "2016-04-20");
		for(int i=0; i<resultList.size();  i++){
			System.out.println("i = " + i);
			System.out.println(resultList.get(i));
			assertNotNull("Result", resultList.get(i));
		}
	}
	
	//testBookDock lägger till en skepp "Tagpad"
	@Test
	public void testBookDock(){
		//public void bookDock(int dockId, String date, String time, String sName, int SID)
		dbm.bookDock(101, "2016-04-20", "08-16", "Tagpad", 153);
		resultList = dbm.getReport("00-00-00", "2016-04-20");
		for(int i=0; i<resultList.size();  i++){
			System.out.println(resultList.get(i));
			assertNotNull("Result", resultList.get(i));
		}
		//dbm.bookDock(dockId, date, time, sName, SID);
		//System.out.println("" + dbm.bookDock(101, "2016-04-20", "08-16", "Tagpad", 153));
	}
	
	//testClesrTestBookDock tar bort en skepp "Tagpad"
	@Test
	public void testClearTestBookDock(){
		dbm.clearTestBookDock(101, "2016-04-20", "08-16", "Tagpad", 153);
	}
}
