package com.ibeifeng.com;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		final int NUM = 5;
		Stack<String> stack = new Stack<String>();
		stack.push("��Ʒ1");
		stack.push("��Ʒ3");
		stack.push("��Ʒ5");
		stack.push("��Ʒ7");
		stack.push("��Ʒ9");
		stack.push("��Ʒ11");

		// �鿴����������Ʒ������ͨ��NUM������Ʒ������
		for (int i = 0; i < NUM; i++) {
			System.out.println(stack.pop());
		}

	}
}
