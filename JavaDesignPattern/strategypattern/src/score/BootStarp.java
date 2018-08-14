package score;


public class BootStarp {

	public static void main(String[] args) {

		Person p1 = new Person("张三");
		double[] score = {10,9,8.5,9.2};
		p1.setScore(score);

		AverageScore as = new AverageScore();
		as.setStrategy(new ConcreteStrategyA());
		double averageScore = as.getAverage(p1.getScore());
		p1.setAverageScore(averageScore);

		//%n是换行的格式字符串,只能用在print输出语句中，%n代表的换行与平台无关
		//5.3f 最小字符宽度为5位数，浮点数输出小数为小数点后三位
		System.out.printf("A策略平均分：%s得到%5.3f%n%n",p1.getName(),p1.getAverageScore());

		as.setStrategy(new ConcreteStrategyB());
		averageScore = as.getAverage(p1.getScore());
		System.out.printf("B策略平均分：%s得到%5.3f",p1.getName(),p1.getAverageScore());

	}

}
