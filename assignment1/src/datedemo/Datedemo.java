package datedemo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datedemo {
	public static void main(String args[])
	{
	LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    String formatted = current.format(formatter);

    System.out.println("Current Date and Time is: " + formatted);
    Date date = new Date();  
    SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate= formatter1.format(date);  
    System.out.println("Date in mm/dd/yy format"+strDate);
    LocalDate l = LocalDate.of(1990, 06, 07); 
    LocalDate now = LocalDate.now(); 
    Period diff = Period.between(l, now);
    System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");

}
}