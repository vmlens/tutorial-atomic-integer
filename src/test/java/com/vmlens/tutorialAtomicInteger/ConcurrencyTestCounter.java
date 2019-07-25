package com.vmlens.tutorialAtomicInteger;

import static org.junit.Assert.*;
import org.junit.Test;
import com.vmlens.annotation.Interleave;


public class ConcurrencyTestCounter {
	
	// An not thread safe counter using a volatile int
	private final CounterNotThreadSafe counter = new CounterNotThreadSafe();
	
	// Change to Counter using AtomicInteger incrementAndGet method:
	//private final CounterUsingIncrement counter = new CounterUsingIncrement();
	
	// Change to Counter using AtomicInteger compareAndSet method:
	//private final CounterUsingCompareAndSet counter = new CounterUsingCompareAndSet();
	
	
	
	@Interleave
	private void increment() {
		counter.increment();
	}
	@Test
	public void testCounter() throws InterruptedException {
		Thread first = new Thread( () ->    {  increment();  } ) ;
		Thread second = new Thread( () ->   {  increment();  } ) ;
		first.start();
		second.start();
		first.join();
		second.join();	
		assertEquals( 2 , counter.getCount());
	}
}
