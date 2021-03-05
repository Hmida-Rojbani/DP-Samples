package dp.behaviour.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
//Subject
public class DataSource extends Subject{
	
	private int value;

	public void setValue(int value) {
		this.value = value;
		super.notifyObservers();
	}
	
	
	
	

}
