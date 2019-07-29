package jav.curscomplet.prodimport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import jav.curscomplet.Util;

public class ProductsMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		int qtProduts;
		String tpProduct;
		String nmProduct;
		double price;
		Product prod = null;
		SimpleDateFormat simpl = new SimpleDateFormat("dd/MM/yyyy");
		Util.text("Enter the number of products: ");
		qtProduts = sc.nextInt();
		ArrayList<Product> listProd = new ArrayList<Product>();
		for(int i = 0; i<qtProduts;i++) {
			Util.textLn("Product #"+(i+1)+" data");
			Util.text("Common, used or imported (c/u/i)? ");
			tpProduct = sc.next();
			Util.text("Name: ");
			nmProduct = sc.next();
			Util.text("Price: ");
			price = sc.nextDouble();
			if(tpProduct.equals("i")) {
				Util.text("Customs fee: ");
				prod = new ImportedProdut(nmProduct, price, sc.nextDouble());
			}else if(tpProduct.equals("u")){
				Util.text("Manufacture date (DD/MM/YYYY): ");
				prod = new UsedProduct(nmProduct, price, simpl.parse(sc.next()));
			}else {
				prod = new Product(nmProduct, price);				
			}
			listProd.add(prod);
		}
		System.out.println("/n");
		System.out.println("PRICE TAGS:");
		for(Product p :listProd) {
			System.out.println(p.priceTag());
		}
	}
}
