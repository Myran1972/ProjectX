package classsource;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DBMethodsTest {

	DBMethods dbm;
	
	@Before
	public void setup(){
		dbm = new DBMethods();
		
	}
	
	@Test
	public void testGetReport() {
		dbm.getReport("2016-04-20", "2016-04-20");
	}
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

}
