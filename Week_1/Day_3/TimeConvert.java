package Day_3;

class TimeConvert {

    public static void main

    {
        public static String timeConversion (String s){

        int hour = Integer.valueOf(s.substring(0, 2));

        if (s.endsWith("AM")) {
            hour = (hour == 12) ? 0 : hour;
        } else {
            hour = (hour == 12) ? hour : hour + 12;
        }
        return String.format("%02d%s", hour, s.substring(2, s.length() - 2));

    }
    }
}