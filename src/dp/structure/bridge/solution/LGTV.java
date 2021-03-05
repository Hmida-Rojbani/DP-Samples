package dp.structure.bridge.solution;

public class LGTV implements Device{

	@Override
	public void turnOn() {
		System.out.println("LG turn On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LG turn Off");
		
	}

	@Override
	public void setChannel(int number) {
		System.out.println("LG set channel :"+number);
		
	}

}
