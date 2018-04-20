package persistence;

//JPA object/relational mapping

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //specifies class is an entity
public class User {
	
	@Id//specifies primary key of an entity
	@GeneratedValue(strategy=GenerationType.AUTO)//specify way primary key is generated
	private long id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public User(long id,String firstName,String lastName,String password,String email){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		this.email=email;
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

