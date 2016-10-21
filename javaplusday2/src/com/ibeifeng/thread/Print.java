package com.ibeifeng.thread;

public class Print implements Runnable {
	int start = 0;

	@Override
	public void run() {
		while (start < 10) {
			synchronized (this) {
				notify();
				if (start++ % 2 == 0) {
					System.out
							.println(Thread.currentThread().getName() + "\tA");
				} else {
					System.out
							.println(Thread.currentThread().getName() + "\tB");
				}
				// 最后一个线程直接返回，不然一直处于等待状态
				if (start == 10) {// 最后一个是9,9++,变为10
					return;
				}
				try {
					wait();// 0进入线程打印出A，等待1进入线程，唤醒等到的线程
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
