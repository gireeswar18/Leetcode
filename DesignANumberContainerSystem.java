package leetcode;

import java.util.*;

public class DesignANumberContainerSystem {
	static class NumberContainers {
		Map<Integer, Integer> ind_map;
		Map<Integer, Set<Integer>> num_map;

		public NumberContainers() {
			ind_map = new HashMap<>();
			num_map = new HashMap<>();
		}

		public void change(int index, int number) {
			if (ind_map.containsKey(index)) {
				int oldNum = ind_map.get(index);
				num_map.get(oldNum).remove(index);
			}

			ind_map.put(index, number);

			if (!num_map.containsKey(number)) {
				num_map.put(number, new TreeSet<>());
			}

			num_map.get(number).add(index);

		}

		public int find(int number) {

			if (num_map.containsKey(number)) {
				for (int num : num_map.get(number))
					return num;
			}

			return -1;
		}
	}

	public static void main(String[] args) {
		NumberContainers obj = new NumberContainers();
		System.out.println(obj.find(10));
		System.out.println();

		obj.change(2, 10);
		obj.change(1, 10);
		obj.change(3, 10);
		obj.change(5, 10);

		System.out.println(obj.find(10));
		System.out.println();

		obj.change(1, 20);

		System.out.println(obj.find(10));

	}
}
