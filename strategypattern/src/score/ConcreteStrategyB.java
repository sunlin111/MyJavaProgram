package score;


/**
 * ¾ßÌå²ßÂÔ
 * @author Sun
 *
 */
public class ConcreteStrategyB implements Strategy {

	@Override
	public double countAverage(double[] score) {
		
		double sum = 0;
		
		for(double each:score){
			
			sum += each;
		}
		
		double average = sum/score.length;
		
		return average;
	}

}
