package test1;

import java.util.ArrayList;
import java.util.List;

public class TestGetInstalledProductList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestGetInstalledProductList test1 = new TestGetInstalledProductList();

		test1.getAvailableProductsList ();
	}

	public List<String> getAvailableProductsList (){
		List <String> installedProductList = new ArrayList<String>();
		
		getinstalledProductList();
		
		installedProductList.add("One");
		installedProductList.add("Two");
		installedProductList.add("Three");
		installedProductList.add("Four");
		
		System.out.println("Size --> " + installedProductList.size());
		
		return installedProductList;
	}
	
	
	public List<String> getinstalledProductList (){
		List <String> installedProductList = new ArrayList<String>();
		installedProductList.add("One");
		installedProductList.add("Two");
		installedProductList.add("Three");
		installedProductList.add("Four");
		
		System.out.println("Size --> " + installedProductList.size());
		installedProductList.remove("Three");
		System.out.println("Size --> " + installedProductList.size());
		
		return installedProductList;
	}
	
	
}
