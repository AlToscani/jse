package com.example.jse.m10.s11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {
	/**
	 * Extract non-duplicated values in input and return them in a list, for
	 * example:
	 * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 */
	public List<Integer> singles(int[] data) {
		Map<Integer, Integer> counter = new HashMap<>();
		for (int i = 0; i < data.length; i++) {
			Integer curr = counter.putIfAbsent(data[i], 1);
			if (curr != null) {
				counter.put(data[i], curr + 1);
			}
//			if (!counter.containsKey(data[i])) {
//				counter.put(data[i], 1);
//			} else {
//				int newVal = counter.put(data[i], null);
//				counter.put(data[i], newVal + 1);
//			}	
		}
		List<Integer> result = new ArrayList<>();

		for (Integer key : counter.keySet()) {
			if (counter.get(key) == 1) {
				result.add(key);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
		System.out.println(result);
	}
}
