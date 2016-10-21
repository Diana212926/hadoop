package com.ibeifeng.com;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		final int NUM = 5;
		Stack<String> stack = new Stack<String>();
		stack.push("商品1");
		stack.push("商品3");
		stack.push("商品5");
		stack.push("商品7");
		stack.push("商品9");
		stack.push("商品11");

		// 查看最近的浏览商品，可以通过NUM控制商品的条数
		for (int i = 0; i < NUM; i++) {
			System.out.println(stack.pop());
		}

	}
}
