package com.ibeifeng.thread;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	public static void main(String[] args) {
		// 创建一个定长可以周期执行的线程池
		ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(10);
		for (int i = 0; i < 50; i++) {
			MyThread myThread = new MyThread();
			// 参数一：要执行的线程 参数二：延时多久执行 参数三：执行周期 参数四：时间单位
			stpe.scheduleAtFixedRate(myThread, 1000, 2000,
					TimeUnit.MILLISECONDS);
		}
		// 关闭
		// stpe.shutdown();延时执行，不能关闭。关闭就不能执行了。

	}
}
