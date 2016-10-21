package com.ibeifeng.com.string;

import java.io.UnsupportedEncodingException;

public class MyString01 {

	public static void main(String[] args) {

		String str = "welcom to beifeng��";
		int index = str.indexOf("e");// ��һ�γ���e
		System.out.println(index);

		int lastIndex = str.lastIndexOf("e");// ���һ�γ���e
		System.out.println(lastIndex);
		System.out.println(str.substring(3));// �±��3��ʼ����ȡ����ģ�����ҿ�
		System.out.println(str.substring(0, 3));// �±��0��ʼ����ȡ3

		// shift +alt+l,�Զ���ȫ��ߵ�
		// iso-8859-1�������? gbKҲ����������
		String string;
		try {
			string = new String(str.getBytes("iso-8859-1"), "utf-8");
			System.out.println(string);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(str.replace("e", "f"));
		System.out.println(str.replace("to", "Too"));
		// �滻��Ҫһ��str���գ����յ���str���������滻

		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println();
		String[] split = str.split("e");
		for (String s : split) {
			System.out.println(s);
		}
	}
}
