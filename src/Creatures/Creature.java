package Creatures;

public class Creature extends AllOfGodsCreatures{
	
	private String creatureName;
	private String whatSings;
	private Boolean needsWhatSings; 
	private int pos;
	
	public Creature(){
		this.setName("All of God's Creatures");
		this.setWhatSings("got a place in the choir");
	}
	
	@Override
	public String getName() {
		return this.creatureName;
	}

	@Override
	public void setName(String name) {
		this.creatureName =  name;		
	}

	@Override
	public String getWhatSings() {
		return this.whatSings;
	}

	@Override
	public void setWhatSings(String whatSings) {
		this.whatSings = whatSings;
	}
	
	public void setNeedsWhatSings(boolean trueorfalse) {
		this.needsWhatSings = trueorfalse;
	}
	
	public boolean itNeedsWhatSings() {
		return needsWhatSings;
		
	}
	
	public void sing() {
		String n = new String(this.getName());
		String ws = new String(this.getWhatSings());
		
		//System.out.println(i.getClass());
		if ((this.getClass().equals(Creatures.Donkey.class))){
			//System.out.println("I am a donkey!");
		}
		
		
		//don't print a "-", instead adjust the lines of the narrator.
		if (n.equals("-")) {
			System.out.println(ws);//println
		}
		else if (ws.equals("-")) {
			System.out.print(n + " ");//just a print no ln
		}
		else {
			System.out.print(n);
			System.out.print(" ");
			System.out.println(ws);
		}
	}
}
