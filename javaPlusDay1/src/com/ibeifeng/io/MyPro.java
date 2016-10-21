package com.ibeifeng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws Exception {
		// 得到属性文件的对象
		File file = new File("src/jdbc.properties");
		FileInputStream in = new FileInputStream(file);
		// 得到属性文件的对象。Properties是以map的方式储存的
		Properties properties = new Properties();
		properties.load(in);
		// 设置属性值
		properties.setProperty("name", "lisi");
		// 得到一个文件的输出流
		FileOutputStream out = new FileOutputStream(file);
		// 把写好的属性放到属性文件中
		properties.store(out, "this is a comment");
		System.out.println("over");

	}
}
