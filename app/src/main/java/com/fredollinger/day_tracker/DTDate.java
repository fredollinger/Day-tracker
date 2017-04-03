package com.fredollinger.day_tracker; /**
 * Created by follinge on 4/2/17.
 */

 	import java.io.BufferedWriter;
    import java.io.File;
    import java.io.FileWriter;
    import java.util.Date;
    import java.util.Calendar;

public class DTDate {

    private Calendar now;
    private Date currentDate;

    public DTDate() {
        now = Calendar.getInstance();
        currentDate = new Date();
    }

    void saveStringToFile(String file, String str) {
        BufferedWriter out = null;
        try
        {
            FileWriter fstream = new FileWriter(file); //true tells to append data.
            out = new BufferedWriter(fstream);
            out.write(str);
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        finally
        {
            if(out != null) {
                try {
                    out.close();
                }
                catch (Exception e)
                {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }

    } // END saveCurrentDate()


    void initDateFile(String file) {
        File f = new File(file);
        if (f.exists()) {
            System.out.println("File exists: [" + file + "]");
            long epoch = now.getTime().getTime();
            saveStringToFile(file, Long.toString(epoch));
            return;
        }

    }

    long daysBetweenDates(long later, long earlier) {
        return (later - earlier)/86400/1000;
    }


    long daysElapsed() {
        long later = now.getTime().getTime();
        long earlier = currentDate.getTime();
        return daysBetweenDates(later, earlier);
    }

    String daysElapsedString() {
        long later = now.getTime().getTime();
        long earlier = currentDate.getTime();
        return Long.toString(daysBetweenDates(later, earlier));
    }

}
