package fitness;

public class TrainingMan {
	
	private Boolean setPositionLieDown;
	
	public void LieDown() {
		System.out.println("Position lie down");
		this.setPositionLieDown = true;
	}
	
	public void StandUp() {
		System.out.println("Position stand up");
		this.setPositionLieDown = false;
	}

}
