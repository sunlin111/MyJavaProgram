package wechat;

public class ConcreteObserver implements Ob<ConcreteSubject>{
	
	private String ObName;
	
	

	public ConcreteObserver(String obName) {
		ObName = obName;
	}



	@Override
	public void update(ConcreteSubject sub, String msg) {
		
		System.out.println("΢�Ź��ں�" +sub + " -> ΢�ź�:" + this.ObName + "�յ���Ϣ" + msg);
		
	}



		
		


}
