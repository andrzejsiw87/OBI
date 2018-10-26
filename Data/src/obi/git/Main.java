package obi.git;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;



public class Main {

	public static void main(String[] args) throws ParseException {
		
		String strDate = "2018-10-17";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStr = formatter.parse(strDate);
        String formattedDate = formatter.format(dateStr);
        System.out.println("Dziœ: " + formattedDate);
     
        
        
        SimpleDateFormat format1 = new SimpleDateFormat("EEEE");
        
        System.out.println(format1.format(dateStr));
       
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        cal.setTime(dateStr);
        cal.add(GregorianCalendar.YEAR, 1);
        dateStr = cal.getTime();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate1 = formatter1.format(dateStr);
        System.out.println("Za rok: " + formattedDate1);
        
        SimpleDateFormat format2 = new SimpleDateFormat("EEEE");
        System.out.println(format2.format(dateStr));
        
      
	}

}
