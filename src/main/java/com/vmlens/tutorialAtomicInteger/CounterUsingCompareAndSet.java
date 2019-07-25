package com.vmlens.tutorialAtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterUsingCompareAndSet {
	private final AtomicInteger count = new AtomicInteger();
	public  void increment() {
		int current = count.get();
		int newValue = current + 1;
		while( ! count.compareAndSet( current , newValue ) ) {
			current = count.get();
			newValue = current + 1;
		}
	}
	public int getCount() {
		return count.get();
	}	
}
