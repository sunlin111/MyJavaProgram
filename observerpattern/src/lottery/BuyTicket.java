package lottery;

import java.util.ArrayList;
import java.util.List;

public class BuyTicket implements BuyTicketObservable{


	private List<BuyOverObserver> obList = new ArrayList<>();
	
	@Override
	public void addObserver(BuyOverObserver ob) {
		
		obList.add(ob);
		
	}

	//�û������Ʊ
	public void Buy_Ticket(){

		/**
		 * 
		 *  ��Ʊҵ��
		 * 
		 */
		System.out.println("�û������Ʊ��������\n������ִ�������߼�\n");
		
		
		//����˷�����Ϣ
		subscribe();
	}

	private void subscribe(){

		for(BuyOverObserver each:obList){
			each.update();
		}
	}

}
