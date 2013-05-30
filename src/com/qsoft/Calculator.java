package com.qsoft;

public class Calculator {

	public static int add(String str) {

		if (str == null) {
			return 0;
		}
		if (str.equals("")) {
			return 1;
		}

		if (str.contains("\n")) {
			str = str.replace("\n", "");
		}
		String[] strTemp = str.split(",");
		int sum = 0;
		for (int i = 0; i < strTemp.length; i++) {
			int result = Integer.parseInt(strTemp[i]);
			if (result < 0) {
				throw new RuntimeException("negatives not allowed");
			}
			sum += result;
		}
		return sum;
	}

}
