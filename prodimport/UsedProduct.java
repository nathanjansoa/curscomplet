package jav.curscomplet.prodimport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	Date manufactureDate;
	SimpleDateFormat simpl = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return name+ "(used) $ " 
				+ String.format("%.2f", price)+" (Manufacture date: "+simpl.format(manufactureDate)+")";
	}
}
