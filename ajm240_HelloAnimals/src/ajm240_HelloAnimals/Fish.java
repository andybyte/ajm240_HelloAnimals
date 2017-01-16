package ajm240_HelloAnimals;

/**
 * @author andymrkva
 * Date: 1/16/2017
 */

public class Fish extends Animal {

	/**
	 * Constructor to create Fish.
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Fish(String age, String color, int weight, int minimumWeight) {
		super(age, color, "fish", weight, minimumWeight);
	}

	/**
	 * Method to move the animal and change weight.
	 */

	public void swim() {
		int newWeight = this.getWeight() - 1;
		this.setWeight(newWeight);
	}

}
