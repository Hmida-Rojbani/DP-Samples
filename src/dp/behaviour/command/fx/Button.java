package dp.behaviour.command.fx;

import lombok.Getter;
import lombok.Setter;

public class Button {
	@Getter@Setter private String label;
	
	private Command command;

	public Button(Command command) {
		super();
		this.command = command;
	}
	

	public void click(){
		command.execute();
	}
}
