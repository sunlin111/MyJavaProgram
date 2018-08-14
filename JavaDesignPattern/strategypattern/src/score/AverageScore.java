package score;

/**
 * 
 * 上下文（content），依赖于策略接口的类
 * @author Sun
 *
 */
public class AverageScore {
	
	private Strategy strategy;
	
	
	/**
	 * 设置策略
	 * @param strategy
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	/**
	 * 使用策略
	 * @param score
	 * @return
	 */
	public double getAverage(double[] score){
		return this.strategy.countAverage(score);
	}

}
