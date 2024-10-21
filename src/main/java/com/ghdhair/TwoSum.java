package com.ghdhair;

import java.util.HashMap;
import java.util.Map;

//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class TwoSum {

	public static void main(String args[]) {
		int[] arr = { 5, 2, 7, 9 };
		int target = 7;
		int[] result = twoSum(arr, target);
		if (result != null) {
//		for(int ans:result)
//		{
			System.out.println(result[0] + " " + result[1]);
//		}
		} else {
			System.out.println("No target found");
		}

	}

	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			int secondNumber = target - arr[i];
			if (hashMap.containsKey(secondNumber)) {
				return new int[] { hashMap.get(secondNumber), i };
			}

		}
		return null;

	}
}
