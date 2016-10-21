package com.ibeifeng.com.string;

import java.util.ArrayList;

public class MyString03 {

	public static void main(String[] args) {
		final int NUM = 100000;// ����������Ҫ��д
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < NUM; i++) {
			if (i == NUM - 1) {
				sb.append(i);
			} else {
				sb.append(i + ",");
			}
		}
		String str = sb.toString();
		// System.out.println(str);
		// 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,

		long start = System.currentTimeMillis();
		String[] str1 = str.split(",");
		long end = System.currentTimeMillis();
		System.out.println(str1.toString());
		System.out.println("API��" + (end - start));

		long start1 = System.currentTimeMillis();
		String[] stringArr = getStringArr(str);
		long end1 = System.currentTimeMillis();
		System.out.println("�Զ���" + (end1 - start1));

		// System.out.println(Arrays.toString(stringArr));

	}

	// �Զ��巽���ָ��ַ���
	public static String[] getStringArr(String str) {

		ArrayList<String> strs = new ArrayList<String>();

		int len = -1;
		while ((len = str.indexOf(",")) != -1) {
			strs.add(str.substring(0, len));
			str = str.substring(len + 1);
			// �����ƶ�alt + �����ƶ�
		}
		strs.add(str);
		return strs.toArray(new String[strs.size()]);
	}
}
