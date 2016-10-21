package com.ibeifeng.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("当前线程名称：" + Thread.currentThread().getName());
	}

}
