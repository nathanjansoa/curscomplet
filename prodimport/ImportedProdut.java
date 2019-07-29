package jav.curscomplet.prodimport;

public class ImportedProdut extends Product {
	
	double customsFee;
	
	public ImportedProdut(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	@Override
	public String priceTag() {
		return name+ " $ " 
				+ String.format("%.2f", this.totalPrice())+" (Customs fee: $ "+customsFee+")";
	}
}
