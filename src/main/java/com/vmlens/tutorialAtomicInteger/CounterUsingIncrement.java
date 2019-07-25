package com.vmlens.tutorialAtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterUsingIncrement {
	private final AtomicInteger count = new AtomicInteger();
	public  void increment() {
		count.incrementAndGet();
	}
	public int getCount() {
		return count.get();
	}	
}
