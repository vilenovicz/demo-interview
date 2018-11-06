package hands;
/**
 * we need to find the angle between hour and minute hands
 *
 */

import static java.lang.Math.abs;

public class Angle {
	public static void main(String[] args) {
		System.out.println(getCorner(12,30));
	}
	
	private static float getCorner(int hours, int minutes) {
		
		int degreeMinutes = 360 / 60 * minutes;
		int degreeHours = 360 / 12 * (hours % 12) + minutes*30/60;
	
		return abs(degreeHours - degreeMinutes);
		
	}
}
