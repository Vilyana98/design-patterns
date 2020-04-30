package fitness;

public class Viewer implements Observer {
	
	private String name;
	private Observable position;
	
	public Viewer(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		if(position == null) {
			System.out.println("No position shown");
			return;
		}
		
		String positionName = position.getUpdate();
		System.out.println(this.getName()+" position is " + positionName);
		
	}

	@Override
	public void changePosition(Observable position) {
		this.position = position;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}





}
