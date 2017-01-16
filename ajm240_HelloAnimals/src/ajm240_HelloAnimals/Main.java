package ajm240_HelloAnimals;

/**
 * @author andymrkva
 * Date: 1/16/2017
 */

import java.util.Vector;

public class Main {


	public static void main(String[] args) {

		// Create vector to store animal objects.

		Vector<Animal> v = new Vector<Animal>();

		// Create one of each animal type.

		Mammal grayWolf = new Mammal("3", "gray", 100, 66);
		Bird condor = new Bird("7", "black and white", 20, 17);
		Fish bluefinTuna = new Fish("14", "blue", 700, 496);

		// Add each animal object to the vector.

		v.add(grayWolf);
		v.add(condor);
		v.add(bluefinTuna);

		// Loop through vector and execute methods for each animal (eat, move, output).

		for(Animal animal : v) {

			animal.eat();

			// Move is based on animal-type.

			if (animal instanceof Mammal) {
				((Mammal)animal).run();
			} else if (animal instanceof Bird) {
				((Bird)animal).fly();
			} else if (animal instanceof Fish) {
				((Fish)animal).swim();
			}

			animal.output();
		}

	}

}
