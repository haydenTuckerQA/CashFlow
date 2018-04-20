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
	
	public User(long id,String firstName,) {
		
	}
}
