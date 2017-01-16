package ajm240_HelloAnimals;

/**
 * @author andymrkva
 * Date: 1/16/2017
 */
public class Animal {

	/** 
	 * Properties of the Animal Class.
	 * @param age Age of the animal.
	 * @param color Color of the animal.
	 * @param type Type of the animal.
	 * @param weight Weight of the animal.
	 * @param minimumWeight The minimum weight the animal can be.
	 */

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	/**
	 * Constructor to create Animal.
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */

	public Animal(String age, String color, String type, int weight, int minimumWeight) {
		super();
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}

	/**
	 * Method for the animal to eat and change weight.
	 */

	public void eat() {
		this.weight = this.weight + 1;
	}

	/**
	 * Getter for weight.
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Setter for weight. Also checks that changing the weight will not go below minimumweight property.
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		if (weight > this.minimumWeight) {
			this.weight = weight;	
		} else {
			System.out.println(weight + " is equal to or below minimum weight for this animal.");
		}
	}

	/**
	 * Method to display the properties of the animal as system.out.print...
	 */

	public void output() {		
		System.out.print(" \nType: " + this.type + "\n Age: " + this.age + "\n Color: " + this.color + "\n Weight: " 
				+ this.weight + "\n MinimumWeight: " + this.minimumWeight);
	}


}
