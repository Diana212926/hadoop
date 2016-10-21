package com.ibeifeng.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NcopyFile {
	public static void main(String[] args) throws Exception {
		// 创建文件输入输出流
		FileInputStream fin = new FileInputStream("d:/test.txt");
		FileOutputStream fos = new FileOutputStream("d:/test2.txt");
		// 得到文件输入输出通道
		FileChannel fic = fin.getChannel();
		FileChannel foc = fos.getChannel();
		// 定义一个字节数为1024的缓冲区
		ByteBuffer bb = ByteBuffer.allocate(1024);

		while (fic.read(bb) != -1) {// 读入缓冲区
			// 切换到读缓冲区模式
			bb.flip();
			// 把读完的数据从缓冲区写出
			foc.write(bb);
			// 切换到向缓冲区写模式
			bb.clear();
		}
		fin.close();
		fos.close();
		fic.close();
		foc.close();

	}
}
