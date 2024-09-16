package leetcode;

public class GasStation {
	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		
		System.out.println(canCompleteCircuit(gas, cost));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		
		int tank = 0;
		int start = 0;
		int totalGas = 0;
		int totalCost = 0;
		
		for (int i = 0; i < gas.length; i++) {
			
			totalCost += cost[i];
			totalGas += gas[i];
			
			tank += gas[i] - cost[i];
			
			if (tank < 0) {
				start = i + 1;
				tank = 0;
			}
			
		}
		
		return totalCost > totalGas ? -1 : start;
		
	}
}
