package com.xworkz.overRide.app;

public class RollingFlex extends Flex {
	public RollingFlex() {
		System.out.println("invoking no-args in RollingFlex");
	}

	@Override
	public void showing() {
		System.out.println("invoking showing in RollingFlex");
	}
}
