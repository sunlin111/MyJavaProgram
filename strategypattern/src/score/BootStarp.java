package score;


public class BootStarp {

	public static void main(String[] args) {

		Person p1 = new Person("����");
		double[] score = {10,9,8.5,9.2};
		p1.setScore(score);

		AverageScore as = new AverageScore();
		as.setStrategy(new ConcreteStrategyA());
		double averageScore = as.getAverage(p1.getScore());
		p1.setAverageScore(averageScore);

		//%n�ǻ��еĸ�ʽ�ַ���,ֻ������print�������У�%n����Ļ�����ƽ̨�޹�
		//5.3f ��С�ַ����Ϊ5λ�������������С��ΪС�������λ
		System.out.printf("A����ƽ���֣�%s�õ�%5.3f%n%n",p1.getName(),p1.getAverageScore());

		as.setStrategy(new ConcreteStrategyB());
		averageScore = as.getAverage(p1.getScore());
		System.out.printf("B����ƽ���֣�%s�õ�%5.3f",p1.getName(),p1.getAverageScore());

	}

}
