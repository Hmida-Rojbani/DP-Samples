package dp.behaviour.command;

import dp.behaviour.command.fx.Button;

public class Main {
	
	public static void main(String[] args) {
		Button button = new Button(new AddCustomerCommand(new CustomerService()));
		button.click();
	}

}
