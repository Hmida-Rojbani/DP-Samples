package dp.structure.bridge.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RemoteControl {
	
	protected Device device;
	
	public void turnOn() {
		device.turnOn();
	}
	
	public void turnOff() {
		device.turnOff();
	}


}
