package dp.structure.bridge.solution;

public class Main {
	
	public static void main(String[] args) {
		AdvancedRemoteControl sonyRC = new AdvancedRemoteControl(new SonyTV());
		
		sonyRC.turnOn();
		sonyRC.turnOff();
		sonyRC.setChannel(3);
		
		RemoteControl lgRC = new RemoteControl(new LGTV());
		
		lgRC.turnOn();
		lgRC.turnOff();
	}

}
