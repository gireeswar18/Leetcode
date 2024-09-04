package leetcode;

import java.util.HashSet;

public class WalkingRobotSimulation {
	public static void main(String[] args) {

		int[] arr = {6,-1,-1,6 };
		int[][] obs = { };

		System.out.println(robotSim(arr, obs));

	}

	public static int robotSim(int[] commands, int[][] obstacles) {

		int[] pos = new int[] { 0, 0 };
		
		int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		
		int currDir = 0;

		int max = Integer.MIN_VALUE;
		
		HashSet<String> obs = new HashSet<>();
		
		for (int[] x : obstacles)
			obs.add(x[0] + " " + x[1]);
		
				
		for (int command : commands) {
			
			if (command == -1) {
				currDir++;
				
				if (currDir == 4)
					currDir = 0;
			}
			else if (command == -2) {
				currDir--;
				
				if (currDir == -1)
					currDir = 3;
			}
			else {
				int xMove = dir[currDir][0];
				int yMove = dir[currDir][1];
				
				for (int i = 0; i < command; i++) {
					
					String nextPos = (pos[0] + xMove) + " " + (pos[1] + yMove);
//					System.out.println("Check for obs: " + nextPos);
					if (obs.contains(nextPos))
						break;
					pos[0] += xMove;
					pos[1] += yMove;
					
				}
			}
			
			max = Math.max(max, pos[0] * pos[0] + pos[1] * pos[1]);
				
		}
		
		return max;
		
	}
}
