package leetcode;

import java.util.*;

public class MyCalendarI {
	public static void main(String[] args) {

	}

	class MyCalendar {

		class Time {
			int start;
			int end;

			Time(int x, int y) {
				this.start = x;
				this.end = y;
			}
		}

			TreeSet<Time> set = new TreeSet<>((a, b) -> a.start - b.start);
		

		public boolean book(int start, int end) {
	        
	        Time t = new Time(start, end);
	        Time before = set.floor(t); // max time less than start
	        Time after = set.ceiling(t); // min time greater than start
	        
	        if (before != null && before.end > start) return false;
	        
	        if (after != null && after.start < end) return false;
	        
	        set.add(t);
	        
	        return true;
	        
	    }
	}
}
