package hands;
/**
 * we need to find the angle between hour and minute hands
 *
 */

import static java.lang.Math.abs;

public class Angle {

	private static final int CIRCLE_DEGREES = 360;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int HOURS = 12;
	private static final int DEGREES_BETWEEN_DIGITS = 30;

	public static void main(String[] args) {
		System.out.println(getCorner(12,30));
	}
	
	private static float getCorner(int hours, int minutes) {

		int degreeMinutes = CIRCLE_DEGREES / MINUTES_IN_HOUR * minutes;
		int degreeHours = CIRCLE_DEGREES / HOURS * (hours % HOURS) + minutes* DEGREES_BETWEEN_DIGITS / MINUTES_IN_HOUR;
	
		return abs(degreeHours - degreeMinutes);
		
	}
}
