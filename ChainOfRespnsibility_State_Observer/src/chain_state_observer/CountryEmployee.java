package chain_state_observer;

public class CountryEmployee extends Employee {
	
	public CountryEmployee() {
		this.payDesk = Employee.COUNTRY;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Country employee message: " + message);
	}
}
