public class Q12Time {
    /**
     *Goal =  computes the angle between the hour hand and the 
            minute hand on a traditional analog clock.Angles should 
            be measured counterclockwise from hour to minute hand.
     * 
     * Formula:
     * start at 12 O clock
     * 
     * angel minute = minute
     * angle hour = (hour * 30) + (minute * 0.5)
     * 
     * why adition in (minute * 0.5) in angle hour ? 
     * 1 hour == 30 degree and 1 minute == 6 degree
     * so --> 30 degree / 60 minute = 0.5
     * 
     * formula to Compute angle between hour hand and the minutee measured by counterclockwise :
     * Absolute diffrence angle = |angle minute - angle hour| 
     * if angle hour less than the angle minute hand:
     *   Absolute diffrence angle  = 360 - Absolute diffrence angle
     * 
     * This adjustment ensures to get the counterclockwise angle from hour to minute hand
     */
    static int computeAngleClock(int minute, int hour) {
        // Calculate the angle of the minute 
        int angleMinute = 6 * minute;
        
        // Calculate the angle of the hour 
        int angleHour = 30 * (hour % 12) + (int)(minute * 0.5);
        
        // Calculate the absolute difference between the two angles
        int angleDifference = Math.abs(angleMinute - angleHour);
        
        // if angle hour less than the angle minute
        if (angleHour < angleMinute){
            angleDifference = 360 - angleDifference;
        }
        
    
        return angleDifference;
    }
    

    public static void main(String[] args) {

        int result1 = computeAngleClock(0, 9);   // 9:00
        System.out.printf("Angle from hour to minute hand 09:00 is %d degrees\n", result1);
        
        int result2 = computeAngleClock(0, 3);   // 3:00
        System.out.printf("Angle from hour to minute hand 03:00 is %d degrees\n", result2);
        
        int result3 = computeAngleClock(0, 18);  // 18:00
        System.out.printf("Angle from hour to minute hand 18:00 is %d degrees\n", result3);
        
        int result4 = computeAngleClock(0, 1);   // 1:00
        System.out.printf("Angle from hour to minute hand 01:00 is %d degrees\n", result4);
        
        int result5 = computeAngleClock(30, 2);  // 2:30
        System.out.printf("Angle from hour to minute hand 02:30 is %d degrees\n", result5);
        
        int result6 = computeAngleClock(41, 4);  // 4:41
        System.out.printf("Angle from hour to minute hand 04:41 is %d degrees\n", result6);
    }
}
