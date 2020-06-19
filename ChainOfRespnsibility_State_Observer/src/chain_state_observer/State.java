package chain_state_observer;

public interface State {
	public void applyState(Context context);
	public String getStateName();
}
