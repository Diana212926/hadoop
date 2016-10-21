package com.ibeifeng.sort;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		// 构建一个数组
		int[] arr = { 1, 23, 4, 79, 56, 78, 0 };
		// 外层循环制定需要循环的次数
		for (int i = 0; i < arr.length - 1; i++) {
			// 内存循环制定怎么遍历
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
