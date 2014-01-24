package org.simple.normal;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.simple.disruptor.SimpleEventHandler;

public class SimpleThread implements Runnable {

	private static Logger logger = Logger.getLogger(SimpleEventHandler.class);

	public void run() {
		for (int i = 1; i < 10000; i++) {
			String uuid = UUID.randomUUID().toString();
			logger.info("catch with normal:" + uuid);
		}
	}

}
