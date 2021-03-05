package dp.structure.facade;

public class Main {
	
	public static void main(String[] args) {
		NotificationFacade facade = new NotificationFacade();
		facade.send("message", "ipAdd", "targetIP");
	}

}
