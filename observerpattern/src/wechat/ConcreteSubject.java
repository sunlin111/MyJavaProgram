package wechat;
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Thread implements Sub {

	
	private String name;

	

	public ConcreteSubject(String name) {
		this.name = name;
	}
	
	public void run() {
	}
	
	public String toString(){
		return this.name;
	}

	private List<Ob<ConcreteSubject>> subList = new ArrayList<Ob<ConcreteSubject>> ();

	@Override
	public void addSubList(Ob<ConcreteSubject> ob) {
		
		this.subList.add(ob);
	}

	
	/**
	 * 主题端 发布消息
	 */
	@Override
	public void subscribe(String msg) {
		
		System.out.println("微信公众号:发布消息" + msg);
		for(Ob<ConcreteSubject> each:subList){
			each.update(this,msg);
		}
		
	}

	@Override
	public void rmSubList(int index) {
		
		this.subList.remove(index);
	}

}
