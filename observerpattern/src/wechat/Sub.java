package wechat;

import java.util.List;

public interface Sub {
	
	public void addSubList(Ob<ConcreteSubject> ob); 
	public void subscribe(String meg);
	public void rmSubList(int index);

}
