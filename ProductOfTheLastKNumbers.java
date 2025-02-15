package leetcode;

import java.util.*;

public class ProductOfTheLastKNumbers {
	static class ProductOfNumbers {

		List<Integer> prefix;
		int currProduct = 1;

		public ProductOfNumbers() {
			prefix = new ArrayList<>();
		}

		public void add(int num) {
			if (num == 0) {
				prefix = new ArrayList<Integer>();
				currProduct = 1;
			}
			else {
				currProduct *= num;
				prefix.add(currProduct);
			}
			
		}

		public int getProduct(int k) {
			if (prefix.size() < k) {
				return 0;
			}
			
			int st = prefix.size() - k - 1;
			
			return prefix.getLast() / ((st < 0) ? 1 : prefix.get(st));
		}
	}

	public static void main(String[] args) {
		ProductOfNumbers productOfNumbers = new ProductOfNumbers();
		productOfNumbers.add(3); // [3]
		productOfNumbers.add(0); // [3,0]
		productOfNumbers.add(2); // [3,0,2]
		productOfNumbers.add(5); // [3,0,2,5]
		productOfNumbers.add(4); // [3,0,2,5,4]
		System.out.println(productOfNumbers.getProduct(2));
		System.out.println(productOfNumbers.getProduct(3));
		System.out.println(productOfNumbers.getProduct(4));
		productOfNumbers.add(8); // [3,0,2,5,4,8]
		System.out.println(productOfNumbers.getProduct(2));
	}
}
