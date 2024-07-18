package com.cbfacademy.search;

public class BinarySearch implements Search {

	@Override
	public int search(int[] sortedArray, int target) {
		int start = 0;
		int end = sortedArray.length;

		while (start < end) {
			int midpoint = (start + end) / 2;
			if (sortedArray[midpoint] == target) {
				return midpoint;
			} else if (sortedArray[midpoint] < target) {
				start = midpoint + 1;
			} else {
				end = midpoint;
			}
		}

		return -1;
	}
}
