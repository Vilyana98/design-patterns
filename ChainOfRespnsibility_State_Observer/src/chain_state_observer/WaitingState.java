package chain_state_observer;

public class WaitingState implements State {
	
		private String stateName = "WAITING";
		
		@Override
		public void applyState(Context context) {
			context.setState(this);
		}
		
		public String getStateName() {
			return this.stateName;
		}
}
