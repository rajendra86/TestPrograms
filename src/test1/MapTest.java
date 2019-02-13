package test1;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest {

	/**
	 * @param args
	 */
	List<Product> prdList1= new ArrayList<Product>();
	List<Product> prdList2 = new ArrayList<Product>();
	Map<String, List<Product>> prdMap = new HashMap<String, List<Product>>();

	public Map<String, List<Product>> getPrdMap() {
		return prdMap;
	}

	public List<Product> getPrdList1() {
		return prdList1;
	}

	public void setPrdList1(List<Product> prdList1) {
		this.prdList1 = prdList1;
	}

	public List<Product> getPrdList2() {
		return prdList2;
	}

	public void setPrdList2(List<Product> prdList2) {
		this.prdList2 = prdList2;
	}

	public void setPrdMap(Map<String, List<Product>> prdMap) {
		this.prdMap = prdMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> list1 = new ArrayList<String>();
		// List<String> list2 = new ArrayList<String>();
		//
		// Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		//
		// list1.add("10");
		// list1.add("20");
		// list1.add("30");
		//
		// list2.add("40");
		// list2.add("50");
		// list2.add("60");
		//
		// map1.put("1st", list1);
		// //map1.put("2nd", list2);
		//
		// //Date expiryDate = new Date("12/11/2012");
		// String expiryDate = new String("12/11/2012");
		//
		// if(expiryDate.isEmpty()){
		// System.out.println("Aiyyo, Empty!!!");
		// }else {
		// System.out.println("Yo not, Empty!!!");
		// }
		//
		//
		//
		// /*for(Map.Entry<String, List<String>> entry : map1.entrySet()) {
		// System.out.println(entry.getKey());
		//
		// for (String prd : entry.getValue()) {
		// System.out.println(prd);
		// }
		//
		// }*/

		MapTest map1 = new MapTest();
		
		
		map1.prepareMap();
		map1.printMap();
		map1.modifyMap();
		map1.printMap();

	}

	public void prepareMap() {

		Product prd1 = new Product();
		Product prd2 = new Product();
		Product prd3 = new Product();
		Product prd4 = new Product();

		prd1.setAssetcount(0);
		prd1.setProductId(1231);
		prd1.setMobileDesc("BarringSet1");
		prd1.setCta("");

		prd2.setAssetcount(1);
		prd2.setProductId(1232);
		prd2.setMobileDesc("BarringSet2");
		prd2.setCta("");

		prd3.setAssetcount(0);
		prd3.setProductId(1233);
		prd3.setMobileDesc("AdultContent1");
		prd3.setCta("");
		
		prd4.setAssetcount(1);
		prd4.setProductId(1232);
		prd4.setMobileDesc("AdultContent2");
		prd4.setCta("");
		
		getPrdList1().add(prd1);
		getPrdList1().add(prd2);
		getPrdList2().add(prd3);
		getPrdList2().add(prd4);

		getPrdMap().put("BarringSet", getPrdList1());
		getPrdMap().put("AdultContent", getPrdList2());

	}

	public void printMap() {
		System.out.println("************************************************");
		for (Map.Entry<String, List<Product>> entry : getPrdMap().entrySet()) {

			System.out.println("Key --> " + entry.getKey());
			System.out.println("Value --> " + entry.getValue());

			System.out.println("**********Values*****************");
			
			for (Product prd : entry.getValue()) {
				
				System.out.println("AssetCount--> " + prd.getAssetcount());
				System.out.println("CTA--> " + prd.getCta());
				System.out.println("MobileDesc--> " + prd.getMobileDesc());
				System.out.println("Product ID--> " + prd.getProductId() + "\n");
			}
			System.out.println("********************************");
		}
		System.out.println("************************************************");
	}

	public void modifyMap(){
		AdultControl adc = new AdultControl();
		
		for (Map.Entry<String, List<Product>> entry : getPrdMap().entrySet()) {
			if(entry.getKey().equalsIgnoreCase("AdultContent")){				
				entry.setValue(adc.updateProductList(entry.getValue()));
				getPrdMap().put(entry.getKey(), entry.getValue());
			}
		}
		
	}
}
