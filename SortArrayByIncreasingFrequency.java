package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency {
	public static void main(String[] args) {
//		int[] arr = { 1, 1, 2, 2, 2, 3 };
		
		int[] arr = {2,3,1,3,2};

		
		SortArrayByIncreasingFrequency s = new SortArrayByIncreasingFrequency();
		
		int[] res = s.frequencySort(arr);
		
		System.out.println(Arrays.toString(res));
	}

	public int[] frequencySort(int[] nums) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int num : nums)
		{
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int num: hm.keySet())
		{
			list.add(num);
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b)
			{
				if (hm.get(a) != hm.get(b))
				{
					return hm.get(a) - hm.get(b);
				}
				else {
					return b - a;
				}
			}
		});
		
		int[] res = new int[nums.length];
		int ind = 0;
		
		for (int num : list)
		{
			for (int i = 0; i < hm.get(num); i++)
			{
				res[ind++] = num;
			}
		}
		return res;
	}
}
