package section9.entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() { super(); }
	
	public Individual(String name, Double income, Double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if( getAnualIncome() < 20000.00 )
			return getAnualIncome() * 0.20 - healthExpenditures * 0.5;
		else 
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		
	}

}
