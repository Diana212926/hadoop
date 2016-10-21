package com.ibeifeng.com.string;

public class MyString {
	public static void main(String[] args) {
		String str1="hello";
		String str2="hello";  //直接引用，没有创建
		String str3=new String("hello");
		String str4=new String("hello");
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//flase
		System.out.println(str3==str4);//flase
	
	}
}
