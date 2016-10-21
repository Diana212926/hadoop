package com.ibeifeng.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {
	public static void main(String[] args) {
		final int NUM = 100000;// 常量命名需要大写
		ArrayList<Integer> strArr = new ArrayList<Integer>();
		LinkedList<Integer> strLink = new LinkedList<Integer>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			strArr.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList" + (end - start));

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			strLink.add(0, i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("LinkedList" + (end1 - start1));

		long start2 = System.currentTimeMillis();
		for (int i = 200; i < NUM; i++) {// 一般不要直接用数字，先定义常量
			strArr.get(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("ArrayList" + (end2 - start2));

		long start3 = System.currentTimeMillis();
		for (int i = 200; i < NUM; i++) {
			strLink.get(i);
		}
		long end3 = System.currentTimeMillis();
		System.out.println("LinkedList" + (end3 - start3));
	}
}
