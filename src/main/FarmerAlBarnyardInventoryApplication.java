package main;

import animals.Cow;
import animals.Pig;
import animals.Sheep;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		
		
		// Farmer Al knows he heard a cow, create a cow object and get its animal sound, then put him to bed!
		Cow cow = new Cow();
		cow.animalSound();
		cow.sleep();
		
		// Lets see if we can do this for the Pig and the Sheep as well...
		
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		
		Sheep sheep = new Sheep();
		sheep.animalSound();
		sheep.sleep();
	}

}
