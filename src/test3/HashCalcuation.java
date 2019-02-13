package test3;

public class HashCalcuation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String password = "hpopen1";
		System.out.println(password.hashCode());

		String pwd = password;
		byte[] salt = new byte[8];
		pwd = pwd.concat(new String(salt));
		System.out.println(pwd.hashCode());

	}
}
