package fitness;

public class LieDown implements Command {
	private TrainingMan position;
	
	public LieDown(TrainingMan position) {
		this.position = position;
	}

	@Override
	public void execute() {
		this.position.LieDown();
		
	}
}
