package com.ibeifeng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class MyPro {

	public static void main(String[] args) throws Exception {
		// �õ������ļ��Ķ���
		File file = new File("src/jdbc.properties");
		FileInputStream in = new FileInputStream(file);
		// �õ������ļ��Ķ���Properties����map�ķ�ʽ�����
		Properties properties = new Properties();
		properties.load(in);
		// ��������ֵ
		properties.setProperty("name", "lisi");
		// �õ�һ���ļ��������
		FileOutputStream out = new FileOutputStream(file);
		// ��д�õ����Էŵ������ļ���
		properties.store(out, "this is a comment");
		System.out.println("over");

	}
}
