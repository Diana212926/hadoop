package com.ibeifeng.thread;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	public static void main(String[] args) {
		// ����һ��������������ִ�е��̳߳�
		ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(10);
		for (int i = 0; i < 50; i++) {
			MyThread myThread = new MyThread();
			// ����һ��Ҫִ�е��߳� ����������ʱ���ִ�� ��������ִ������ �����ģ�ʱ�䵥λ
			stpe.scheduleAtFixedRate(myThread, 1000, 2000,
					TimeUnit.MILLISECONDS);
		}
		// �ر�
		// stpe.shutdown();��ʱִ�У����ܹرա��رվͲ���ִ���ˡ�

	}
}
