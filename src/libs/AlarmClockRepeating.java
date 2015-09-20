package libs;
import libs.AlarmClock;

public class AlarmClockRepeating extends AlarmClock {
	
	

	public AlarmClockRepeating(String time) {
		super(time);
	}
	public AlarmClockRepeating(String time, String name) {
		super(time, name);
	}
	public AlarmClockRepeating(String time, String name, int soundResId) {
		super(time, name, soundResId);
	}
	
	public void setWeekdaysForRepeat(String[] weekdays){
		
		this.weekdaysForRepeat = weekdays;
	}
	
	public String[] getWeekdaysForRepeat(){
		
		return this.weekdaysForRepeat;
	}
	

}
