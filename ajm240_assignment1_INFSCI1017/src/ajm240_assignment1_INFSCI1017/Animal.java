package ajm240_assignment1_INFSCI1017;

/**
 * @author andymrkva
 *
 */
public class Animal {

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
	
	/**
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
	 * 
	 */
	
	public void eat() {
		
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * 
	 */
	
	public void output() {
		
	}
	
	
}
