package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * pre-recorded information about your thing object before user input
	 */
	public Thing()
	{
		age = -99;
		weight = -.00005;
		name = "";
	}
	
	/**
	 * changes previous decided information to user input from the scanner
	 * @param name sets name to user input
	 * @param age sets age to user input
	 * @param weight sets weight to user input
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * takes from parameters and outputs in the popup as string
	 */
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old and weighs " + weight;
		
		return thingInfo;
				
	}
	
}
