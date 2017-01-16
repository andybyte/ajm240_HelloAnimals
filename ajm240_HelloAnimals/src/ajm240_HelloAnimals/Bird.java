package ajm240_HelloAnimals;

/**
 * @author andymrkva
 * Date: 1/16/2017
 */

public class Bird extends Animal {

	/**
	 * Constructor to create Bird.
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Bird(String age, String color, int weight, int minimumWeight) {
		super(age, color, "bird", weight, minimumWeight);
	}

	/**
	 * Method to move the animal and change weight.
	 */

	public void fly() {
		int newWeight = this.getWeight() - 2;
		this.setWeight(newWeight);
	}
}
