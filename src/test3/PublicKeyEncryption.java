package test3;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class PublicKeyEncryption {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 * @throws NoSuchPaddingException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException,
			InvalidKeyException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException {

		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(1024);
		KeyPair keyPair = keyPairGenerator.genKeyPair();

		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

		byte[] blowfishKeyBytes = "This is will be encrypted This".getBytes();
		System.out.println(new String(blowfishKeyBytes));
		byte[] cipherText = cipher.doFinal(blowfishKeyBytes);
		System.out.println(new String(cipherText));
		cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());

		byte[] decryptedKeyBytes = cipher.doFinal(cipherText);
		System.out.println(new String(decryptedKeyBytes));

	}

}
