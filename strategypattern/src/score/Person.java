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
	 * @param name Ҫ���õ� name
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
	 * @param averageScore Ҫ���õ� averageScore
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
	 * @param score Ҫ���õ� score
	 */
	public void setScore(double[] score) {
		this.score = score;
	}
	
	
	
}
