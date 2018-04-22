package Cashflow.Cashflow;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith (SpringRunner.class)

public class ControllerTest {
	
	@InjectMocks
	private DatabaseReader databasereader;
	
	@Before 
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void databaseReaderTest() {
		
		String expectedResult = "{\"Transaction_ID\":\"1\",\"Amount\":\"£2000\",\"Date\":\"1/12/01\",\"In_or_Out\":\"In\",\"Type:\";\"Credit\",\"Description\";\"Monthly Wage\",\"Transaction_ID\";\"1\"}";
		String actualResult = databasereader.getJSON();
		assertEquals(expectedResult,actualResult);
		
	}

}
