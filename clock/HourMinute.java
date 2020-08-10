/**This problem is known as Clock angle problem 
 * where we need to find angle between hands of 
 * an analog clock at a given time. */
public class HourMinute{
    public static void main(String[] args) {
        int hour = 12;
        int min = 0;
        System.out.println(findAngle(hour,min));
    }

    static int findAngle(int h, int m){
        if(m == 60){
            m = 0;
            h +=1;
        }
        if (h>=12){
            h = h - 12;
        }

        /**The minute hand moves 360 degree in 60 minute(or 6 degree in one minute) 
         * and hour hand moves 360 degree in 12 hours(or 0.5 degree in 1 minute).  */
        int hour_angle = (int)(0.5 * (h*60 + m));
        int min_angle = 6 * m;

        int diff = Math.abs(hour_angle-min_angle);

        int angle = Math.min(360-diff,diff);
        return angle;
    }
}