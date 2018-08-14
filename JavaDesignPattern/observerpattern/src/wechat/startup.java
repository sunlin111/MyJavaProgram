package wechat;

public class startup {
	
	public static void main(String[] args) {
		Ob<ConcreteSubject> ob1 = new ConcreteObserver("观察者一号");
		Ob<ConcreteSubject> ob2 = new ConcreteObserver("观察者二号");
		Ob<ConcreteSubject> ob3 = new ConcreteObserver("观察者三号");
		
		Sub sub = new ConcreteSubject("被观察者");
		
		sub.addSubList(ob1);
		sub.addSubList(ob2);
		sub.addSubList(ob3);
		
		sub.subscribe("中国队赢了");
				
	}

}
