package access;
import java.util.Calendar;
import java.util.Date;

public class ClanderTesting {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.add(Calendar.MONTH, -1);
		Date date = cal.getTime();
		System.out.println(date);
		Date date2=new Date();
		System.out.println(date2.getDate());
		System.out.println(date2.getDate()-1);
		date.setHours(0);
		System.out.println(date);
	}
	
}
