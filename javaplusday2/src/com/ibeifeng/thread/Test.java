package com.ibeifeng.thread;

public class Test {

	public static void main(String[] args) {
		Print print = new Print();
		Thread t1 = new Thread(print, "�߳�A");
		Thread t2 = new Thread(print, "�߳�B");

		t1.start();
		t2.start();
	}
}
