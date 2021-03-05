package dp.behaviour.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chart implements Observer{
	private DataSource dateSource;

	@Override
	public void update() {
		System.out.println("chart got updated :"+ dateSource.getValue());
		
	}

}
