package course.section3.lecture43.application;

import java.util.Locale;
import java.util.Scanner;

import course.section3.lecture43.entities.Product;
import javafx.scene.transform.Scale;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in the stock: ");
		int quantity = sc.nextInt();
		product.addProducts( quantity );
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: " + product);
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		sc.close();
	}
}
