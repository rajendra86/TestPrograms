package test1;

import java.util.ArrayList;
import java.util.List;

public class AdultControl {

	public List<Product> updateProductList(List<Product> prodList){
		System.out.println("Inside updateProductList()");
		System.out.println("prodList Size-->" + prodList.size());
		
		List<Product> prdList = new ArrayList<Product>();		
		
		for (Product product : prodList) {
			System.out.println("Product Id-->" + product.getProductId());
			if(product.getProductId() == 1232){
				System.out.println("Inside If");
				product.setCta("Hello");
			}
			prdList.add(product);
		}
			
		System.out.println("prdList Size-->" + prdList.size());
		
		return prdList;		
	}
}
