package wechat;

public class startup {
	
	public static void main(String[] args) {
		Ob<ConcreteSubject> ob1 = new ConcreteObserver("�۲���һ��");
		Ob<ConcreteSubject> ob2 = new ConcreteObserver("�۲��߶���");
		Ob<ConcreteSubject> ob3 = new ConcreteObserver("�۲�������");
		
		Sub sub = new ConcreteSubject("���۲���");
		
		sub.addSubList(ob1);
		sub.addSubList(ob2);
		sub.addSubList(ob3);
		
		sub.subscribe("�й���Ӯ��");
				
	}

}
