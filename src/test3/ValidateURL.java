package test3;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.apache.commons.validator.routines.UrlValidator;

public class ValidateURL {

	/**
	 * @param args
	 * @throws URISyntaxException
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws URISyntaxException,
			NoSuchAlgorithmException {
		String success_url = "http://google.com";
		// "/faces/usagePayments";
		// "ftp://foo.bar.com/";
		String[] schemes = { "http", "https" };
		UrlValidator urlValidator = new UrlValidator();

		if (urlValidator.isValid(success_url)) {
			System.out.println("url is valid");
		} else {
			System.out.println("url is invalid");
		}

		URI uri = new URI(success_url);
		System.out.println("Is Absolute--> " + uri.isAbsolute());
		
	}
}
