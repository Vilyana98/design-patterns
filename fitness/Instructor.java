package fitness;

public class Instructor {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void showExercise() {
		System.out.println("Exercise have been shown");
		this.command.execute();
	}

}
