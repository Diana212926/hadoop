package com.ibeifeng.sort;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 1, 23, 4, 79, 56, 78, 0 };
		// ���ѭ���ƶ���Ҫѭ���Ĵ���
		for (int i = 0; i < arr.length - 1; i++) {
			// �ڴ�ѭ���ƶ���ô����
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
