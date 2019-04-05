package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Check {
	
	private ArrayList<Product> allProductsList = new ArrayList<Product>();
	private final float PVN = 0.21f;
	
	
	public Check(ArrayList<Product> allProductsList) {
		setAllProductsList(allProductsList);
	}
	
	public ArrayList<Product> getAllProductsList() {
		return allProductsList;
	}
	public void setAllProductsList(ArrayList<Product> allProductsList) {
		this.allProductsList = allProductsList;
	}
	public float getPVN() {
		return PVN;
	}

	@Override
	public String toString() {
		return "Check [allProductsList=" + allProductsList + ", PVN=" + PVN + "]";
	}
	
	public double calculateTotalSum() {
		double sum = 0;
		for (Product product : allProductsList) {
			sum+=product.getPrice();
		}
		
		
		return sum;
	}
	public void printCheck() {
		PrintWriter check;
		try {
			check = new PrintWriter("Check.txt", "UTF-8");
			for (int i = 0; i < allProductsList.size(); i++) {
				check.println(allProductsList.get(i).getTitle() + ": " + allProductsList.get(i).getPrice() + "EUR " + allProductsList.get(i).getAmount() + "gab");
			}
			check.println("Kopeja summa ir : " + calculateTotalSum() + "EUR, tai skaita  PVN "+ PVN);
			
			check.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}