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
				// ���һ���߳�ֱ�ӷ��أ���Ȼһֱ���ڵȴ�״̬
				if (start == 10) {// ���һ����9,9++,��Ϊ10
					return;
				}
				try {
					wait();// 0�����̴߳�ӡ��A���ȴ�1�����̣߳����ѵȵ����߳�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
