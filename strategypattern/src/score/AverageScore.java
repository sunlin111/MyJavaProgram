package score;

/**
 * 
 * �����ģ�content���������ڲ��Խӿڵ���
 * @author Sun
 *
 */
public class AverageScore {
	
	private Strategy strategy;
	
	
	/**
	 * ���ò���
	 * @param strategy
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	/**
	 * ʹ�ò���
	 * @param score
	 * @return
	 */
	public double getAverage(double[] score){
		return this.strategy.countAverage(score);
	}

}
