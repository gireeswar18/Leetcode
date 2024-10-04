package leetcode;

import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkill {
	public static void main(String[] args) {
		int[] arr = {3,2,5,1,3,4};
		
		System.out.println(dividePlayers2(arr));
	}

	public static long dividePlayers(int[] skill) {
		
		Arrays.sort(skill);
		int n = skill.length;
		long res = 0;
		int equalSkill = skill[0] + skill[n - 1];
		int f, l;
		
		for (int i = 0; i < n / 2; i++) {
			f = skill[i];
			l = skill[n - i - 1];
			
			if (f + l != equalSkill)
				return -1L;
			
			res += (f * l);
		}
		
		return res;
		
	}
	
	public static long dividePlayers2(int[] skill) {
		int[] skillArr = new int[1001];
		int n = skill.length;
		long res = 0;
		
		int totalSkill = 0;
		for (int s : skill) {
			totalSkill += s;
			skillArr[s]++;
		}
		
		if (totalSkill % (n / 2) != 0)
			return -1L;
		
		int reqSkill = totalSkill / (n / 2);
		
		for (int s : skill) {
			
			int teamMateSkill = reqSkill - s;
			
			if (skillArr[teamMateSkill] == 0)
				return -1L;
			
			skillArr[teamMateSkill]--;
			res += (long) s * (long) teamMateSkill;
			
		}
		
		return res / 2;
	}
}
