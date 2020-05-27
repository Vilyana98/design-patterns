package mediatorAndFactory;


import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
	public Bot bot;
	private List<User> users;
    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
        if (message.equals("addBot")) {
        	this.bot = bot.getBot();
        	System.out.println("Bot was added");
        } 
        
        if (null != bot && bot.verifyWord(message)) {
			deleteUser(user);
			System.out.println("User " + user.name + " was removed!");
			bot.InformUser(this.users);
			return;
        }
    }

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void deleteUser(User user) {
		this.users.remove(user);
	}
}