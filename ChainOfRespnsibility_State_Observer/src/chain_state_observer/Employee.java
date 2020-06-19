package chain_state_observer;

public abstract class Employee {
	
	public static int CITY = 1;
	public static int COUNTRY = 2;
	public static int ABROAD = 3;
	
	protected int payDesk;
	
	protected Employee otherEmployee;
	
	public void setOtherEmployee(Employee otherEmployee) {
		this.otherEmployee = otherEmployee;
	}
	
	public void logMessage(int payDesk, String message) {
		
		if(this.payDesk <= payDesk) {
			this.writeMessage(message);
		}
		
		if(this.otherEmployee != null) {
			this.otherEmployee.logMessage(payDesk, message);
		}
		
	}
	
	abstract protected void writeMessage(String message);
	
}
