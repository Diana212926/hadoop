package com.ibeifeng.thread;

public class BuyTickets extends Thread {
	static int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			// ʣ��1��Ʊ��1,2,3�̶߳������ˣ��������0��-1��Ʊ

			synchronized (BuyTickets.class) {
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "��ǰ��Ʊ��:" + tickets--);
				}
			}
		}

	}
}
