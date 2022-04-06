package Creatures;

public class Bottom extends Creature{
	public Bottom() {
		super.setName("Bottom");
		super.setWhatSings("Listen to the bass it's the one on the bottom");

	}
	
	public void sing() {
		System.out.println(super.getWhatSings());
	}
}
