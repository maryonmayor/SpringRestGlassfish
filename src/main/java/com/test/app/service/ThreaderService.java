package com.test.app.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class ThreaderService implements Threader {

	private static final Logger logger = Logger.getLogger(ThreaderService.class.getName());

	ExecutorService executor = Executors.newCachedThreadPool();
	ExecutorService distributor = Executors.newFixedThreadPool(10);

	private Thread jobThread;

	public void startMainThread() {
		jobThread = new Thread("job thread") {
			@Override
			public void run() {
				logger.info("Threader service ::::: info gumagana!!!: " + Thread.currentThread().getName());
			}
		};

		Thread thread = new Thread("Distributor Thread") {
			@Override
			public void run() {
				while (true) {
					executor.execute(jobThread);
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		distributor.execute(thread);

	}

}
