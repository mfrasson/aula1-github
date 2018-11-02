package section9.entities;

public class OutsourceEmployee extends Employee {
	
	private Double additionalCharger;
	
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharger) {
		super(name, hours, valuePerHour);
		this.additionalCharger = additionalCharger;
	}

	public Double getAdditionalCharger() {
		return additionalCharger;
	}

	public void setAdditionalCharger(Double additionalCharger) {
		this.additionalCharger = additionalCharger;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharger * 1.1;
	}
}
