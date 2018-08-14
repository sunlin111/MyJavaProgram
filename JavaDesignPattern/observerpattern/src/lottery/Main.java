package lottery;

public class Main {
	
	public static void main(String[] args) {
		
		BuyTicket bt = new BuyTicket();
		bt.addObserver(new BuyOverDBRecord());
		bt.addObserver(new BuyOverGive());
		bt.addObserver(new BuyOverMsg());
		
		bt.Buy_Ticket();
	}

}
