package section9.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section9.entities.ImportedProduct;
import section9.entities.Product;
import section9.entities.UsedProduct;

public class ProgramProduct {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for( int i = 1; i <= n; i++ ) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, user or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if( ch == 'i' ) {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add( new ImportedProduct(name, price, customsFee) );
			}
			else if ( ch == 'u' ) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse( sc.next() );
				list.add( new UsedProduct(name, price, manufactureDate) );
			}
			else
				list.add( new Product(name, price) );
			System.out.print("");
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : list)
			p.priceTag();
		
		sc.close();
	}
}
