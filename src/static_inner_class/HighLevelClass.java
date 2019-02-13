package static_inner_class;

public class HighLevelClass {

	private String name;
	InnerClass inner = new InnerClass();

	private static String stname = "Hello ";

	public String getName() {
		return name + inner.getInnerName();
	}

	public void setName(String name) {
		this.name = name;
	}
			
	public static class InnerClass {

		private String innerName;
		

		public String getInnerName() {
			return stname + innerName;
		}

		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}
	}

	public class AnotherInnerClass {

		private String newName;

		public String getNewName() {
			return name + " " + newName + stname;
		}

		public void setNewName(String newName) {
			this.newName = newName;
		}
	}

}
