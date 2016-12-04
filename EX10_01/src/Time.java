import java.util.Calendar;


public class Time {
	private int hour;
	private int minute;
	private int second;
	

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time();
		
		time2.setTime(5555500000L);
		//System.currentTimeMillis();
		
		
		System.out.println("First time:" + time1.hour + time1.minute + time1.second);
		System.out.println("Second time:" + time2.hour + time2.minute + time2.second);
	}
public Time() {
	Calendar calen = Calendar.getInstance();
	hour = calen.get(Calendar.HOUR_OF_DAY);
	minute = calen.get(Calendar.MINUTE);
	second = calen.get(Calendar.SECOND);
}
public void setTime(long elapseTime){
	Calendar c=Calendar.getInstance();
	c.setTimeInMillis(elapseTime);
	hour=c.get(Calendar.HOUR_OF_DAY);
	minute=c.get(Calendar.MINUTE);
	second=c.get(Calendar.SECOND);
	}

}
