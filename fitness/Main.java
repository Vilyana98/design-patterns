package fitness;

public class Main {
	
	public static void main(String[] args) {
		
		Exercise exercise = new Exercise();
		
		Observer viewer1 = new Viewer("Viewer 1");
		Observer viewer2 = new Viewer("Viewer 2");
		Observer viewer3 = new Viewer("Viewer 3");
		
		exercise.subscribe(viewer1);
		exercise.subscribe(viewer2);
		exercise.subscribe(viewer3);
		
		
		Instructor instructor = new Instructor();
		TrainingMan trainingMan = new TrainingMan();
		Command lieDown = new LieDown(trainingMan);
		Command standUp = new StandUp(trainingMan);
		
		instructor.setCommand(lieDown);
		instructor.showExercise();
		exercise.setName("Lie");
		
		instructor.setCommand(standUp);
		instructor.showExercise();
		exercise.setName("Up");
	}

}
