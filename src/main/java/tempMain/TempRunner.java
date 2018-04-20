package tempMain;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import persistence.User;

public class TempRunner {
	
	public static void main (String [] args) {
		//User user1 = new User(1, "Ryan", "Prince", "ryanlprince@email.com", "BigFish");
		//User user2= new User(2, "Jane", "Doe", "janedoe@email.com", "password");
		
		
		//symmetric key
		String password ="password";
		String encPassword ="";
		String key="10as1";
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(key.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted=cipher.doFinal(password.getBytes());
			encPassword=new String(encrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println(encPassword);
		
		//decrypt 
		
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(key.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, skeyspec);
			byte[] decrypted=cipher.doFinal(encPassword.getBytes());
			password=new String(decrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println(password);
		
	}
}
