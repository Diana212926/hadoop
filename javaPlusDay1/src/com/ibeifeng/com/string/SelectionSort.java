package com.ibeifeng.com.string;

import java.util.Arrays;

/*遍历一次，记录下最值元素所在位置，遍历结束后，将此最值元素调整到合适的位置

 这样一次遍历，只需一次交换，便可将最值放置到合适位置
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] v = { 1, 3, 2, 6, 5, 1, 4, 9, 7, 0, 22, 44, 22, 77, 76 };

		for (int i = 0; i < v.length; i++) {
			int min = v[i];
			int index = i;
			int temp;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < min) {
					min = v[j];
					index = j;
				}
			}

			temp = v[i];
			v[i] = min;
			v[index] = temp;
		}

		System.out.println(Arrays.toString(v));

	}

}
