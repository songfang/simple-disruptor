package org.simple.normal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleNormalMain {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(10);
		long start = System.currentTimeMillis();
		exec.execute(new SimpleThread());
		System.out.println(System.currentTimeMillis() - start);
		exec.shutdown();

	}

}
