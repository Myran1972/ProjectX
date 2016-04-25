package classsource;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.mockito.Mockito;

import junit.framework.Assert;

public class DBMethodsTest1 {
	
	DBMethods dbm;
	//DBMethods db_mock = Mockito.spy(DBMethods.class);
	
	@Before
	public void setup(){
		dbm = new DBMethods();		
	}
	
	String result;
	List<String> result1;
	
	//@Test
	public void getReport(){
		result1 = dbm.getReport("00-00-00", "2017-12-12");
		System.out.println(result1);
	}
	
	


	

}
