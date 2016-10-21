package com.ibeifeng.com.string;

import java.io.UnsupportedEncodingException;

public class MyString01 {

	public static void main(String[] args) {

		String str = "welcom to beifeng我";
		int index = str.indexOf("e");// 第一次出现e
		System.out.println(index);

		int lastIndex = str.lastIndexOf("e");// 最后一次出现e
		System.out.println(lastIndex);
		System.out.println(str.substring(3));// 下标从3开始，截取后面的，左闭右开
		System.out.println(str.substring(0, 3));// 下标从0开始，不取3

		// shift +alt+l,自动补全左边的
		// iso-8859-1乱码出现? gbK也是乱码问题
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
		// 替换需要一个str接收，接收到的str才能永久替换

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
