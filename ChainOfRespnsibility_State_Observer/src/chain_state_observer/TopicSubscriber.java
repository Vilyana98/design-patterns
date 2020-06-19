package chain_state_observer;

public class TopicSubscriber implements Observer{
	
	private String name;
	private Observable topic;
	
	public TopicSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(topic == null) {
			System.out.println("No topic");
			return;
		}
		
		String topicName = topic.getUpdate();
		System.out.println(this.getName() + " took the parcel! ");
		System.out.println("Employee current state has been changed to: " + topicName);
		
	}
	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
