package persistence;

//JPA object/relational mapping

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;


@Entity //specifies class is an entity
public class User {
	
	@Id//specifies primary key of an entity
	@GeneratedValue(strategy=GenerationType.AUTO)//specify way primary key is generated
	private long id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public User(long id,String firstName,String lastName,String emai,String password){	
		this.password=hashPassword(password);
		this.email=email;//encryptEmail(email);
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	public String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			System.out.println("hashed password is: "+DatatypeConverter.printHexBinary(digest).toUpperCase());
			return DatatypeConverter.printHexBinary(digest).toUpperCase();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getFistName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
		
}

