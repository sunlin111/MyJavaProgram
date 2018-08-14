package lottery;

import java.util.ArrayList;
import java.util.List;

public class BuyTicket implements BuyTicketObservable{


	private List<BuyOverObserver> obList = new ArrayList<>();
	
	@Override
	public void addObserver(BuyOverObserver ob) {
		
		obList.add(ob);
		
	}

	//用户购买彩票
	public void Buy_Ticket(){

		/**
		 * 
		 *  买票业务
		 * 
		 */
		System.out.println("用户买完彩票啦！！！\n接下来执行以下逻辑\n");
		
		
		//主题端发布消息
		subscribe();
	}

	private void subscribe(){

		for(BuyOverObserver each:obList){
			each.update();
		}
	}

}
