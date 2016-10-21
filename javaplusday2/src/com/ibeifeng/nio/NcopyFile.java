package com.ibeifeng.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NcopyFile {
	public static void main(String[] args) throws Exception {
		// �����ļ����������
		FileInputStream fin = new FileInputStream("d:/test.txt");
		FileOutputStream fos = new FileOutputStream("d:/test2.txt");
		// �õ��ļ��������ͨ��
		FileChannel fic = fin.getChannel();
		FileChannel foc = fos.getChannel();
		// ����һ���ֽ���Ϊ1024�Ļ�����
		ByteBuffer bb = ByteBuffer.allocate(1024);

		while (fic.read(bb) != -1) {// ���뻺����
			// �л�����������ģʽ
			bb.flip();
			// �Ѷ�������ݴӻ�����д��
			foc.write(bb);
			// �л����򻺳���дģʽ
			bb.clear();
		}
		fin.close();
		fos.close();
		fic.close();
		foc.close();

	}
}
