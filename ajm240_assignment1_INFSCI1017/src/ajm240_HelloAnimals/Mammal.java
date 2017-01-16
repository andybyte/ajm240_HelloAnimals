package ajm240_HelloAnimals;

/**
 * @author andymrkva
 * Date: 1/16/2017
 */

public class Mammal extends Animal {

	/**
	 * Constructor to create Mammal.
	 * @param age age of the animal
	 * @param color color of the animal
	 * @param type type of animal
	 * @param weight weight of animal
	 * @param minimumWeight minimum weight of the animal (changes in weight cannot go below this)
	 */

	public Mammal(String age, String color, int weight, int minimumWeight) {
		super(age, color, "mammal", weight, minimumWeight);
	}



	/**
	 * Method to move the animal and change weight.
	 */

	public void run() {
		int newWeight = this.getWeight() - 1;
		this.setWeight(newWeight);
	}

}
