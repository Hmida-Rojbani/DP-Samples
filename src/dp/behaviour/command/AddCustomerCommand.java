package dp.behaviour.command;

import dp.behaviour.command.fx.Command;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class AddCustomerCommand implements Command {
	private CustomerService service;
	
	@Override
	public void execute() {
		service.addCustomer();
		
	}

}
