package chain_state_observer;

public class PrepareState implements State {
	
	private String stateName = "PREPARING";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}
