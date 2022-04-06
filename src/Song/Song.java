package Song;

import java.util.ArrayList;

import Creatures.Bird;
import Creatures.Creature;
import Creatures.Donkey;

import java.util.Scanner; // Student must add this line

public class Song {
	

	public ArrayList<Creature> song = new ArrayList<>();
	
	public void playSong() {
		for(Creature c:song) {
			c.sing();
		}
	}
}
