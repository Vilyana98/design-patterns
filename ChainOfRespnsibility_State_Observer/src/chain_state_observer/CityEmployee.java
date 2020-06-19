package chain_state_observer;

public class CityEmployee extends Employee{
	
	public CityEmployee() {
		this.payDesk = Employee.CITY;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("City employee message: " + message);
	}
}
