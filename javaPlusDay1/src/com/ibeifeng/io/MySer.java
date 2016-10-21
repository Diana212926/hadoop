package com.ibeifeng.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MySer {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("D:/test.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		User user = (User) ois.readObject();

		System.out.println(user.getGender());
		System.out.println(user.getId());
		System.out.println(user.getName());
	}
}
