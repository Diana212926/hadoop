package com.ibeifeng.com.string;

public class MyString02 {

	public static void main(String[] args) {
		final int NUM = 10000;// ����������Ҫ��д
		String string = "hello";
		StringBuilder sb = new StringBuilder("hello");
		StringBuffer sb1 = new StringBuffer("hello");

		// �����ַ������ӵķ�ʽ
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			string = string + i;
		}
		long end = System.currentTimeMillis();

		System.out.println("�����ַ������ӵķ�ʽ" + (end - start));

		System.out.println("****************************");

		// ��ȡstringBuilder��ʽ��ʱ��
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			sb.append(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("��ȡStringBuilder��ʽ��ʱ��" + (end1 - start1));

		// ��ȡstringBuffer��ʽ��ʱ��
		System.out.println("********************");
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			sb1.append(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("��ȡStringBuffer��ʽ��ʱ��" + (end2 - start2));
	}

}
/*
 * �����ַ������ӵķ�ʽ384*************************** ��ȡstringBuilder��ʽ��ʱ��2
 * ******************* ��ȡstringBuffer��ʽ��ʱ��2
 */
// ����ʱ���࣬StringBuffer���̰߳�ȫ�ģ�������΢�͵㡣
