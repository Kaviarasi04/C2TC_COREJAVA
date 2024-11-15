package com.tns.ifet.daysix.usingfinal;

public class FinalMethodClass {
	FinalMethodClass() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	final void show() {
		System.out.println("Value of a: " + a);
	}
}