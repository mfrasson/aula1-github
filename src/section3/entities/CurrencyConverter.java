package section3.entities;

public class CurrencyConverter {
	
	private static final double TAX_IOF = 1.06;
	
	public static double calculateConversion( double dollarPrice, double dollarAmount ) { 
		return ( (dollarAmount * dollarPrice) * TAX_IOF);
	}
	
}
