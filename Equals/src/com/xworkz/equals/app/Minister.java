package com.xworkz.equals.app;

public class Minister {
	private String name;

	public Minister() {

	}

	public Minister(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("object is not null...");
			if (obj instanceof Minister) {
				System.out.println("object is a minister...");
				Minister casted = (Minister) obj;
				// Minister currentinstance=this;
				if (casted.name.equals(name)) {
					System.out.println("minister name is same");
				} else {
					System.out.println("minister name is not same");

				}
			} else {
				System.out.println("object is not minister....");
			}
		} else {
			System.out.println("object is null....");
		}
		return true;
	}
}
