package dp.structure.bridge.problem;

public class SonyAdvancedRemote extends AdvancedRemoteControll {

	@Override
	public void setChannel(int number) {
		System.out.println("Sony set channel :"+number);

	}

	@Override
	public void turnOn() {
		System.out.println("Sony turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony turn off");

	}

}
