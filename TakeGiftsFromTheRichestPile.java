package leetcode;

import java.util.*;

public class TakeGiftsFromTheRichestPile {
	public static void main(String[] args) {

		int[] t1 = { 25, 64, 9, 4, 100 };
		System.out.println(pickGifts(t1, 4));

		int[] t2 = { 1, 1, 1, 1 };
		System.out.println(pickGifts(t2, 4));
	}

	public static long pickGifts(int[] gifts, int k) {
		Queue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
		long res = 0;
		
		for (int gift : gifts) {
			maxHeap.add(gift);
			res += gift;
		}
		
		for (int i = 0; i < k; i++) {
			int maxVal = maxHeap.poll();
			int newVal = ((int) Math.sqrt(maxVal));
			res -= maxVal;
			res += newVal;
			maxHeap.add(newVal);
		}
		
//		while (!maxHeap.isEmpty()) {
//			res += maxHeap.poll();
//		}
		
		return res;
		
	}
}
