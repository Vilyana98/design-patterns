package fitness;

public class StandUp implements Command {
	private TrainingMan position;
	
	public StandUp(TrainingMan position) {
		this.position = position;
	}

	@Override
	public void execute() {
		this.position.StandUp();
		
	}
}
