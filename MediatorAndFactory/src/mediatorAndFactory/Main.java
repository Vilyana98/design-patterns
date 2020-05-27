package mediatorAndFactory;

public class Main{
	public static void main(String[] args) {

	MessageMediator mediator = new ChatMessageMediator();
    
	UserFactory userFactory = FactoryProducer.getUsers();
	
	User user1 = new ChatUser(mediator, "Petyr");
    User user2 = new ChatUser(mediator, "Spas");
    User user3 = new ChatUser(mediator, "Georgi");
    
  
    user1.send("What's up?");
    
    user2.send("addBot");
    
    user3.send("Hey cats!");
    user2.send("Ooop,what happend");
   
    
   
	
	}
}
