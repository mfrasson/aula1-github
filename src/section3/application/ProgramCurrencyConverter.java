package section3.application;

import java.util.Locale;
import java.util.Scanner;

import section3.entities.CurrencyConverter;

public class ProgramCurrencyConverter {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bougth?");
		double dollarAmount = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculateConversion(dollarPrice, dollarAmount) );
		
		sc.close();
	}
}
