package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizedSet {
	
	HashSet<Integer> hs;
	List<Integer> list;
	
	public RandomizedSet() {
		hs = new HashSet<Integer>();
		list = new ArrayList<Integer>();
	}

	public boolean insert(int val) {
		if (hs.add(val))
		{
			list.add(val);
			return true;
		}
		return false;
	}

	public boolean remove(int val) {
		if (hs.contains(val))
		{
			list.remove(Integer.valueOf(val));
			hs.remove(val);
			return true;
		}
		return false;
	}

	public int getRandom() {
		
		Random rand = new Random();
		
		int ind = rand.nextInt(0, hs.size());
		
		return list.get(ind);
	}
	
	public static void main(String[] args) {
		 RandomizedSet obj = new RandomizedSet();
		 Scanner sc = new Scanner(System.in);
		 
		 int a1 = sc.nextInt();
		 boolean param_1 = obj.insert(a1);
		 System.out.println(param_1);
		 
		 int a2 = sc.nextInt();
		 boolean param_2 = obj.remove(a2);
		 System.out.println(param_2);
		 
		 int param_3 = obj.getRandom();
		 System.out.println(param_3);
		 
		 sc.close();
	}
}
