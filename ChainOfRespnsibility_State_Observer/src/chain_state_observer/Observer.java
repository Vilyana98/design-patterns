package chain_state_observer;

public interface Observer {
	public void update();
	public void setTopic(Observable topic);
}
