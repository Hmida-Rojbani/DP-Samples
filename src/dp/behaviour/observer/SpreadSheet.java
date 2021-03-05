package dp.behaviour.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpreadSheet implements Observer{
	private DataSource dateSource;

	@Override
	public void update() {
		System.out.println("SpredSheet got updated :"+ dateSource.getValue());
		
	}
}
