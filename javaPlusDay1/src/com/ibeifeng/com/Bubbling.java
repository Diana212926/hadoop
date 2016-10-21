package com.ibeifeng.com;

import java.util.Arrays;

public class Bubbling {
	// 冒泡排序
	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 2, 5, 9, 7, 4 };
		// 控制遍历几次，然后以什么方法排序
		for (int i = 0; i < arr.length - 1; i++) {// len-1
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
