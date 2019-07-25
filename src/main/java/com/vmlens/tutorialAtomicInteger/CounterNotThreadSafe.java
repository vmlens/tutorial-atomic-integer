package com.vmlens.tutorialAtomicInteger;

public class CounterNotThreadSafe {
	private volatile int count = 0;
	public void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}	
}
