package com.ibeifeng.com.string;

public class MyString {
	public static void main(String[] args) {
		String str1="hello";
		String str2="hello";  //ֱ�����ã�û�д���
		String str3=new String("hello");
		String str4=new String("hello");
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//flase
		System.out.println(str3==str4);//flase
	
	}
}
