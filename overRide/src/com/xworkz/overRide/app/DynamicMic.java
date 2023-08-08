package com.xworkz.overRide.app;

public class DynamicMic extends Mic {
	public DynamicMic() {
		System.out.println("invoking main in DynamicMic");
	}

	@Override
	public void translate() {
		System.out.println("invoking translate in DynamicMic");
	}
}
