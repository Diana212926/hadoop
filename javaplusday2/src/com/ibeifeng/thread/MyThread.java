package com.ibeifeng.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("��ǰ�߳����ƣ�" + Thread.currentThread().getName());
	}

}
