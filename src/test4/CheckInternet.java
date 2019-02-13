package test4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;

public class CheckInternet {

	/**
	 * @param args
	 * @throws UnknownHostException
	 * @throws SocketException
	 */
	public static void main(String[] args) throws UnknownHostException,
			SocketException {

		// InetAddress ownIP = InetAddress.getLocalHost();
		//
		// System.out.println("IP of my system is := " +
		// ownIP.getHostAddress());
		// System.out.println("Domain Name := " + ownIP.getCanonicalHostName());

		isInternetReachable();

	}

	public static boolean isInternetReachable() {
		try {
			// make a URL to a known source
			URL url = new URL("http://www.wikipedia.org/");

			// open a connection to that source
			HttpURLConnection urlConnect = (HttpURLConnection) url
					.openConnection();

			// trying to retrieve data from the source. If there
			// is no connection, this line will fail
			Object objData = urlConnect.getContent();
			System.out.println("Its OK");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("1");
			System.out.println("Its NOT OK");
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("2");
			System.out.println("Its NOT OK");
			return false;
		}
		return true;
	}
}
