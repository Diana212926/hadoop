package com.ibeifeng.com;

import java.util.Arrays;

public class Bubbling {
	// ð������
	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 2, 5, 9, 7, 4 };
		// ���Ʊ������Σ�Ȼ����ʲô��������
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
