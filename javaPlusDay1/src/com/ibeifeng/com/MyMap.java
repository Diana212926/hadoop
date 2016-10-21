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

		// ����map���ϡ�HashMap��֧�ֵ�������HashSet,set��list֧�ֵ�����
		// ����һ��set�������
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// ͨ��map�õ�key���������set������
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string);// ���key��ֵ
			System.out.println(map.get(string));// ͨ��key���value��ֵ
		}
	}
}
