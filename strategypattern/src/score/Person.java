package score;

public class Person {

	private String name;
	
	private double AverageScore;
	
	private double[] score;

	public Person(String name) {
		
		this.name = name;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return averageScore
	 */
	public double getAverageScore() {
		return AverageScore;
	}

	/**
	 * @param averageScore 要设置的 averageScore
	 */
	public void setAverageScore(double averageScore) {
		AverageScore = averageScore;
	}

	/**
	 * @return score
	 */
	public double[] getScore() {
		return score;
	}

	/**
	 * @param score 要设置的 score
	 */
	public void setScore(double[] score) {
		this.score = score;
	}
	
	
	
}
