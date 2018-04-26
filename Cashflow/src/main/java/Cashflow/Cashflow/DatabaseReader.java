package Cashflow.Cashflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cashflow.persistence.User;

import java.sql.*;

@Controller
@RequestMapping(path="/user")
public class DatabaseReader {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String secondName, @RequestParam String email, @RequestParam String sortCode, @RequestParam String accountNumber, @RequestParam String bankName) {
		
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setSecondName(secondName);
		newUser.setEmail(email);
		newUser.setSortCode(sortCode);
		newUser.setAccountNumber(accountNumber);
		newUser.setBankName(bankName);

		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		
		return userRepository.findAll();
	}

}
