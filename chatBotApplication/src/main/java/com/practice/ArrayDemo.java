package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
	
	public static int[] twoSum(int[] numbers) {
	    List<Integer> list = new ArrayList<>();
	    boolean found = twoSum(numbers, 0, 0, list);
	    if (found) {
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }
	    return null;
	}

	public static boolean twoSum(int[] numbers, int from, int target,
	        List<Integer> list) {
	    for (int i = from; i < numbers.length; i++) {
	        int current = numbers[i];
	        list.add(current);
	        int newTarget = target-current;
	        if (newTarget == 0) {
	            return true;
	        }
	        boolean found = twoSum(numbers, i+1, newTarget, list);
	        if (found) {
	            return true;
	        }
	        list.remove(list.size()-1);
	    }
	    return false;
	}
	public static void main(String[] args) {
		int[] numbers = {-4,-1,5,3,1};
		
		ArrayDemo ad = new ArrayDemo();
		ad.twoSum(numbers);
		
	}

}
