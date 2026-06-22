package MATHS;

public class AngleBtwHandsOfClock {
    public static double angleClock(int hour, int minutes) {
        double hourAngle = (hour != 12 ? hour * 30 : 0) + (double)minutes / 2;
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }

    public static void main(String args[]){
        int hour = 3;
        int minutes = 30;

        double result = angleClock(hour, minutes);
        System.out.println("Angle between clock hands: " + result);
    }
}
