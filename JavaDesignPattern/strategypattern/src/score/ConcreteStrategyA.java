package score;

import java.util.Arrays;


/**
 * ¾ßÌå²ßÂÔ
 * @author Sun
 *
 */
public class ConcreteStrategyA implements Strategy {

	@Override
	public double countAverage(double[] score) {
		
		double sum = 0;
		
		if(score.length <= 2){
			return 0;
		}
		
		Arrays.sort(score);
		
		for(int i = 1;i < score.length - 1;i++){
			sum += score[i];
		}
		return sum/(score.length - 2);
	}

}
