package chain_state_observer;

public class AbroadEmployee extends Employee{
	
	public AbroadEmployee() {
		this.payDesk = Employee.ABROAD;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Abroad employee message: " + message);
	}

}
