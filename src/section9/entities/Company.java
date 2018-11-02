package section9.entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() { super(); }
	
	public Company(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if( numberOfEmployees > 10 )
			return getAnualIncome() * 0.14;
		else
			return getAnualIncome() * 0.16;
	}
	
	

}
