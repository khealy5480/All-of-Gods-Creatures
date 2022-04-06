package Creatures;

public class Top extends Creature{	
	public Top() {
		super.setName("Top");
		super.setWhatSings("Listen to the top with the");
	}
	
	public void sings() {
		System.out.println("Listen to the top with the");
//				this.getWhatSings());
	}
}
