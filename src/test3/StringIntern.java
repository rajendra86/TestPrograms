package test3;


public class StringIntern {
	String s3 = new String("ABC");
	String s1 = "ABC";

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s1 == null) ? 0 : s1.hashCode());
		result = prime * result + ((s3 == null) ? 0 : s3.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringIntern other = (StringIntern) obj;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
		if (s3 == null) {
			if (other.s3 != null)
				return false;
		} else if (!s3.equals(other.s3))
			return false;
		return true;
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		StringIntern sin = new StringIntern();
		//System.out.println(sin.s1.hashCode());
		//System.out.println(sin.s3.hashCode());
		 System.out.println(sin.s3==sin.s1);
		 System.out.println(sin.s3.intern()==sin.s1);
		 //System.out.println(s3.equals(s1));

		// System.out.println(s1.hashCode() + " " + s3.hashCode());
		// s1="abc";
		// System.out.println(s1.hashCode() + " " + s3.hashCode());

	}

}
