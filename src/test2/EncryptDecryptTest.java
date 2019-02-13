package test2;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncryptDecryptTest {

	/**
	 * @param args
	 */
	private static String str;
	private static Cipher cipher;
	private static String keyValue = "TheBestSecretKey";
	
	
	public static Key generateKey(){
		Key key = new SecretKeySpec(keyValue.getBytes(),"AES");
		return key;
	}
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		str = "This is the value which will be encrypted";
		cipher = Cipher.getInstance("AES");
		Key key = generateKey();
		
		
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		System.out.println(keyGen.generateKey().getClass());
		
		System.out.println("String before encryption--> " + str);
		System.out.println("Key used for encryption--> " + key);
		
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = cipher.doFinal(str.getBytes());
		String encryptedStr = new String(Base64.encodeBase64(encVal));
		System.out.println("String after encoding--> " + encryptedStr);
					
		System.out.println("\nDecrypting the String--> " + encryptedStr);
		key = generateKey();
		System.out.println("Key used for decryption--> " + key);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decValue = Base64.decodeBase64(encryptedStr);		
		byte[] decVal = cipher.doFinal(decValue);
		String decryptedStr = new String(decVal);
		System.out.println("String after decryption--> " + decryptedStr);
	}
	

}
