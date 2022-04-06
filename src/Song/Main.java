package Song;

import java.io.*;
import java.util.Scanner;
import Creatures.*;

public class Main {
	
	public static void main(String[] args){
		Main mn = new Main();
		mn.readInCreatures();

	}
	
	public int putNewOnSong(Song s, Creature c, String creatureName, String creatureSings, String className) {
		System.out.println("Here are the three:");
		System.out.println(creatureName);
		System.out.println(creatureSings);
		System.out.println(className);
		
		
		switch(creatureSings) {
		case "/":
			System.out.println(creatureName + " " + className);
			Class<?> clazz = null;
			try {
				clazz = Class.forName(className);
				System.out.println("-----:" + Class.forName(className));
				System.out.println("Did i fail yet!");
		       
			}
			catch (ClassNotFoundException cnfe){
				System.out.println("Please create class: " + className);
				return 0;
			}
			catch (Exception e) {
				System.out.println("Error");
				return 0;
			}
			return 2;
			

		default:
			c.setName(creatureName);
			c.setWhatSings(creatureSings);
			s.song.add(c);
			return 1;
		}

	}

	public void readInCreatures(){
		String fileName = new String();
		fileName = "C:\\Users\\kevin\\Progs Java\\Workspace\\All-of-Gods-Creatures\\src\\Song\\CreaturesInput.txt";
		String creatureType = new String();
		String creatureName = new String();
		String creatureSings = new String();
		Song s = new Song();
		UserInputFunctions uif = new UserInputFunctions();
		int val;
		
		try{
			FileInputStream fin=new FileInputStream(fileName);
			Scanner scanin = new Scanner(fin);
			scanin.useDelimiter("\\n");
			while(scanin.hasNextLine()){
				creatureType = scanin.nextLine();
				if (scanin.hasNextLine()) {
					creatureName = scanin.nextLine();
				}
				else {
					creatureName = "";
				}
				if(scanin.hasNextLine()) {
					creatureSings = scanin.nextLine();
				}
				else {
					creatureSings = "";
				}
				
				//When a star is present in the input file, the
				//student needs to make a class to obtain user input.
				//uif is the instance of the class that I made.
				if (creatureSings.equals("*")){	
					creatureSings = uif.getWhatSings(creatureName);
				}
				
				//System.out.println("making new creature!");
				Creature c = new Creature();
				creatureType = creatureType.toLowerCase();
				//System.out.println("This is the type: " + creatureType);
				//System.out.println("The Class is ------>: " + c.getClass());
				
				
				switch(creatureType) {
				case "versechange":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "narrator":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "creature":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "top":	
					Top top = new Top();
					s.song.add(top);
					break;
				case "middle":
					Middle middle = new Middle();
					s.song.add(middle);
					break;
				case "bottom":
					Bottom bottom = new Bottom();
					s.song.add(bottom);
					break;
				case "bird":
					Bird bird = new Bird();
					s.song.add(bird);
					break;
				case "blackbird":
					BlackBird bb = new BlackBird();
					s.song.add(bb);
					break;
				case "owl":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "otter":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "porcupine":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "human":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "dogsandcats":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;				
				case "donkey":
					Donkey donkey = new Donkey();
					s.song.add(donkey);
					break;
				case "pony":
					Pony pony = new Pony();
					s.song.add(pony);
					break;
				case "duck":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "honeybee":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "prairiedog":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "badger":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;				
				case "bullfrog":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "hippopotamus":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "cow":
					c.setName(creatureName);
					c.setWhatSings(creatureSings);
					s.song.add(c);
					break;
				case "":
					System.out.println("Error: Null String Input!");
					break;
				default:
					System.out.println("Creature Type not Created Yet! " + creatureType);
//					throw CreatureNotFoundException; --will add later
					break;
				}
			}
			fin.close();
			scanin.close();
		} 
		//catch file IO errors
		catch(FileNotFoundException fnfe) {
			System.out.println("File Not Found!");
			System.out.println(fnfe);
		}
		//catch file IO errors
		catch(Exception e){
			System.out.println(e);
		}
		
		s.playSong();
	}
}

//* 4 Pillars of OOP
//* Must create and use at least 3 Constructors
//* Must have at least 4 methods
//* Must include a section to get responses from User
//* Must contain a switch statement
//* Must handle at least 1 exception
//* Project must include at least 3 Classes
//* Use one of the Collections structures.
//* Use a loop to traverse through your Collection structure that you chose and modify,
//*   organize, or return values from the iteration. 
//*   ex. Sort my structure, Search, find and return object 
