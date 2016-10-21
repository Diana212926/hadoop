package com.ibeifeng.com.string;

public class SelectSort {

	public static void main(String[] args) {
		int[] v = { 1, 3, 2, 6, 5, 1, 4, 9, 7, 0, 22, 44, 22, 77, 76 };
		for (int i = 0; i < v.length - 1; i++) {
			int max = v[i];
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[i] < v[i + 1]) {
					max = v[i + 1];
				}
				System.out.print(max + ",");
			}
			
		}

	}
}
