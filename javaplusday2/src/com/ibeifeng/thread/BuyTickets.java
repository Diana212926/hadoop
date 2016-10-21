package com.ibeifeng.thread;

public class BuyTickets extends Thread {
	static int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			// 剩余1张票。1,2,3线程都进来了，将会出现0和-1张票

			synchronized (BuyTickets.class) {
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "当前的票号:" + tickets--);
				}
			}
		}

	}
}
