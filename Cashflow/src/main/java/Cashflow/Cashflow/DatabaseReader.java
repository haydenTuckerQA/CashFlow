package Cashflow.Cashflow;

import org.springframework.stereotype.Controller;
import java.sql.*;

@Controller
public class DatabaseReader {
	
	@GetMapping(path="all")
	public @ResponseBody String getJSON() {
		
		

		return null;
	}

}
