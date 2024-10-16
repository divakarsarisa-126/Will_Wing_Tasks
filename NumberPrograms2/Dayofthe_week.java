package Second_Day_Tasks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dayofthe_week {

    public static String getDayofWeek(String date, String dateFormat) {
    	
         try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
            
            Date dob = sdf.parse(date);
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dob);
            
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            String dayString = "";

            switch (dayOfWeek) {
                case Calendar.SUNDAY:
                    dayString = "SUNDAY";
                    break;
                case Calendar.MONDAY:
                    dayString = "MONDAY";
                    break;
                case Calendar.TUESDAY:
                    dayString = "TUESDAY";
                    break;
                case Calendar.WEDNESDAY:
                    dayString = "WEDNESDAY";
                    break;
                case Calendar.THURSDAY:
                    dayString = "THURSDAY";
                    break;
                case Calendar.FRIDAY:
                    dayString = "FRIDAY";
                    break;
                case Calendar.SATURDAY:
                    dayString = "SATURDAY";
                    break;
            }

            return dayString;

        } catch (Exception e) {
            e.printStackTrace();
            return "INVALID DATE";
        }
    }

    public static void main(String[] args) {
        String date = "31/01/1998";
        String dateFormat = "dd/MM/yyyy";
        String dayOfWeek = getDayofWeek(date, dateFormat);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}

