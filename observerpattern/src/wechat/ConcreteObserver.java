package wechat;

public class ConcreteObserver implements Ob<ConcreteSubject>{
	
	private String ObName;
	
	

	public ConcreteObserver(String obName) {
		ObName = obName;
	}



	@Override
	public void update(ConcreteSubject sub, String msg) {
		
		System.out.println("微信公众号" +sub + " -> 微信号:" + this.ObName + "收到消息" + msg);
		
	}



		
		


}
