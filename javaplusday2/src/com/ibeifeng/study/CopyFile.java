package com.ibeifeng.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("d:/test.txt");
		FileOutputStream fos = new FileOutputStream("d:/test1.txt");

		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = fin.read(buffer)) != -1) {// ����
			fos.write(buffer, 0, len);// д��
		}
		// ˢ�²��ر���
		fos.flush();
		fin.close();
		fos.close();
	}

}
