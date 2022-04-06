# All-of-Gods-Creatures Song Program
All of God's Creatures sung by each class of animals.  Demonstration of inheritance and polymorphism.


This program was designed to be a replit to teach inheritance, abstraction, polyMorphisim, encapsulation 
and scanner input.  It also may teach searching and file IO. The teacher should state the following 
rules:

1)	The objective of this program is to make the output print out the lyrics to the song "All of 
	God's Creatures."  This output can be shown in the file "output.txt."  It is a traditional country
	folk song.  
	
2) 	The files "CreaturesInput.txt", "Output.txt", "Main.java", "AllOfGodsCreatures.java" and "Song.java"
	are to be given to the student in the replit, and are not allowed to be changed by them.
	
3)	This is a replit where each instance of each animal is made to sing their part, from it's own code.
	The student should be made aware that he is not allowed to hard code any string unless it is in a
	Creature (or descendants) object.  
	
4)	The student must make the following structures on their own, but some may be provided for clarity 
	depending on the student's programming ability.  These classes must have the same name as the ones 
	in the "CreaturesInput.txt" file:

							      -----Creature------
						          /            |          \
							/              |             \
						       /               |               \
						   Bottom           Middle             Top
						    /|\              /|\                /|\
						Low Singing     Middle Singing       top Singing
						  Creatures       Creatures           Creatures

5)	To demonstrate polymorphism, the Creatrue, Top, Middle, and Bottom classes also do some of the singing.
	These classes must be made by the student.  Some of the Top, Middle, and Bottom singing creatures are 
	also to be made by the student (see the note about the slash, #4 in the next section).  It is not 
	necessary to create all the creatures.  However, the program can be modified to do so. 
	
6)	As noted below, the student must also make a user input class from the abstract class 
	"AbstUserInputFunctions." 
					  
About the CreaturesInput file:
1)	The CreatruesInput file is divided into groups of three line inputs.  The first line denotes the 
	Creature type (the names of the creatures must match this first line).  The second denotes its name, 
	and the third denotes what the creature of that type will sing. The student is not allowed to 
	change this file. 
	
2)	To challenge the student to provide proper structure and output, various escape characters are put 
	in the CreaturesInput file.  These include the slash ("/") and the star ("*").
	
3)	The star ("*") is placed to denote the need for user input.  The student must extend a user input 
	function class from the "abstUserInputFunctions" class.  The one created for this project was 
	"UserInputFunctions.java."  This is where the Scanner can be placed to teach user console input. The
	two examples used in this example are the honey bee "hums" and the prairie dog "fiddles".  These
	must be inputted by hand. To match the replit, the input must be as follows:
		To answer what your creature sings, complete the following sentence:
		The/a/an honey bee: hums
		To answer what your creature sings, complete the following sentence:
		The/a/an prairie dog: fiddles
	
4)	The slash ("/") denotes the need for a proper creature type to be created (including Top, Middle and 
	Bottom types).  The switch statement in the "Main.java" class checks for this requirement, so that 
	the student is forced to make the class, and properly change what they sing. Otherwise a slash will
	appear in the output.  If the class is not made, the student will get a compilation error.  
	Classes that need to be made:
		Top, Middle, Bottom, Bird, BlackBird, Donkey, Pony

	
\******************************************************************************************************/
