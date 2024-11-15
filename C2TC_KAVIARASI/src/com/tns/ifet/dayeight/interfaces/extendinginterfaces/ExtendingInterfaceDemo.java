package com.tns.ifet.dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String arg[]) {
		ExtendingInterfaceDemo eid = new ExtendingInterfaceDemo();
		eid.print();
		eid.show();
	}
}