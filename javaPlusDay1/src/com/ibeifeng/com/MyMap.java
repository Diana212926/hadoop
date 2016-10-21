package com.ibeifeng.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "lisi1");
		map.put("2", "lisi2");
		map.put("3", "lisi3");
		map.put("4", "lisi4");

		// 遍历map集合。HashMap不支持迭代器，HashSet,set和list支持迭代器
		// 方法一：set是无序的
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// 通过map得到key，将其放在set集合中
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string);// 输出key的值
			System.out.println(map.get(string));// 通过key输出value的值
		}
	}
}
