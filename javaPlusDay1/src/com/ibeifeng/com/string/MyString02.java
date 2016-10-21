package com.ibeifeng.com.string;

public class MyString02 {

	public static void main(String[] args) {
		final int NUM = 10000;// 常量命名需要大写
		String string = "hello";
		StringBuilder sb = new StringBuilder("hello");
		StringBuffer sb1 = new StringBuffer("hello");

		// 利用字符串连接的方式
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			string = string + i;
		}
		long end = System.currentTimeMillis();

		System.out.println("利用字符串连接的方式" + (end - start));

		System.out.println("****************************");

		// 获取stringBuilder方式的时间
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			sb.append(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("获取StringBuilder方式的时间" + (end1 - start1));

		// 获取stringBuffer方式的时间
		System.out.println("********************");
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			sb1.append(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("获取StringBuffer方式的时间" + (end2 - start2));
	}

}
/*
 * 利用字符串连接的方式384*************************** 获取stringBuilder方式的时间2
 * ******************* 获取stringBuffer方式的时间2
 */
// 运行时间差不多，StringBuffer是线程安全的，性能稍微低点。
