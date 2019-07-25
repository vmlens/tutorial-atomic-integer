# tutorial-atomic-integer

This tutorial shows why we need the class `AtomicInteger` and how to use it.

Run the test with maven using:
```
mvn install
```

The test uses a not thread safe implementation, the class `com.vmlens.tutorialAtomicInteger.CounterNotThreadSafe`. To change to a thread safe implementation change the counter variable in the test
`com.vmlens.tutorialAtomicInteger.ConcurrencyTestCounter` to `CounterUsingIncrement` or `CounterUsingCompareAndSet`. 

The tutorial is described in greater detail in [this blog port](https://vmlens.com/articles/cp/atomic_integer/)
