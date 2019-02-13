package test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.binary.Base64;

public class EncryptDecryptWithKeyStore {

	/**
	 * @param args
	 */
	private static String str;
	private static Cipher cipher;
	private static Key key = null;
	private static Properties propertyDB = null;

	public static String readKeyStorePath() throws IOException {
		propertyDB = new Properties();
		String keyStore = null;
		FileInputStream propertyFile = new FileInputStream(
				"C:\\config.properties");
		propertyDB.load(propertyFile);
		propertyFile.close();

		/*
		 * Enumeration<Object> keyStoreKeys = propertyDB.keys(); while
		 * (keyStoreKeys.hasMoreElements()) { keyStore =
		 * propertyDB.getProperty((String) keyStoreKeys.nextElement()); }
		 */
		keyStore = propertyDB.getProperty("keystorename");
		return keyStore;
	}

	public static Key generateKey() throws KeyStoreException,
			NoSuchAlgorithmException, CertificateException, IOException,
			UnrecoverableKeyException {
		String keystorePassword = "idcidc";
		String keyAlias = "certone";
		String keyPassword = "idcidc";
		String keyStoreName = readKeyStorePath();
		FileInputStream fis = new FileInputStream(keyStoreName);
		KeyStore keyStore = KeyStore.getInstance("JCEKS");
		keyStore.load(fis, keystorePassword.toCharArray());
		fis.close();
		key = keyStore.getKey(keyAlias, keyPassword.toCharArray());
		return key;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException,
			UnrecoverableKeyException, KeyStoreException, CertificateException,
			IOException {
		str = "This is the value which will be encrypted";
		cipher = Cipher.getInstance("AES");
		key = generateKey();

		System.out.println("String before encryption--> " + str);
		System.out.println("Key used for encryption--> " + key);

		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = cipher.doFinal(str.getBytes());
		String encryptedStr = new String(Base64.encodeBase64(encVal));
		System.out.println("String after encryption and encoding--> "
				+ encryptedStr);

		System.out.println("\nDecrypting the String--> " + encryptedStr);
		key = generateKey();
		System.out.println("Key used for decryption--> " + key);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decValue = Base64.decodeBase64(encryptedStr);
		byte[] decVal = cipher.doFinal(decValue);
		String decryptedStr = new String(decVal);
		System.out.println("String after decryption and decoding--> "
				+ decryptedStr);
	}
}
