package chain_state_observer;

public class Main {
	
	private static Employee getChain() {
		Employee cityEmployee = new CityEmployee();
		Employee countryEmployee = new CountryEmployee();
		Employee abroadEmployee = new AbroadEmployee();
		
		cityEmployee.setOtherEmployee(countryEmployee);
		countryEmployee.setOtherEmployee(abroadEmployee);
		return cityEmployee;
	}
	
	public static void main(String[] args) {

		Employee chain = getChain();
		chain.logMessage(3, "Wellcome in our office!");
		
		Context city = new Context("City Employee");
		Context country = new Context("Country Employee");
		Context abroad = new Context("Abroad Employee");
		
		WaitingState waitingState = new WaitingState();
		PrepareState prepareState = new PrepareState();
		
		waitingState.applyState(city);
		waitingState.applyState(country);
		waitingState.applyState(abroad);
		
		Topic topic = new Topic();
		
		int selectedPayDesk = 2;
		
		if(selectedPayDesk == 1) {
			System.out.println("Selected pay desk: " + selectedPayDesk);
			prepareState.applyState(city);
			System.out.println("City Employee state has been updated to: "+ city.getState().getStateName());
			System.out.println("Your order has been accepted");
		}else if(selectedPayDesk == 2) {
			System.out.println("Selected pay desk: " + selectedPayDesk);
			prepareState.applyState(country);
			System.out.println("Country Employee state has been updated to: "+ country.getState().getStateName());
			System.out.println("Your order has been accepted");
		}else if(selectedPayDesk == 3) {
			System.out.println("Selected pay desk: " + selectedPayDesk);
			prepareState.applyState(abroad);
			System.out.println("Abroad Employee state has been updated to: "+ abroad.getState().getStateName());
			System.out.println("Your order has been accepted");
		}
		
		
		Observer obs1 = new TopicSubscriber("Boy Watcher");
		topic.subscribe(obs1);
		topic.setName(waitingState.getStateName());

	}
}
