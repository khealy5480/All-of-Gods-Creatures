package Song;

import java.util.Scanner;

public class UserInputFunctions {
	Scanner scananswer = new Scanner(System.in); 
	
	//Student must add this function
	public String getWhatSings(String creatureName) {
		System.out.println("To answer what your creature sings, complete the following sentence:");
		System.out.print("The/a/an "+ creatureName + ": ");

		return scananswer.nextLine();
	}

	
}
