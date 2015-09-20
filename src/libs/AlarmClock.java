package libs;

public class AlarmClock {
	
	protected String  name;
	protected String  time;
	protected int     soundResId;
	protected String[] weekdaysForRepeat;
	protected boolean active;

	public  AlarmClock(String time) {
		this.time = time;
	}
	public AlarmClock(String time, String name) {
		this.time = time;
		this.name = name;
	}
	public AlarmClock(String time, String name, int soundResId) {
		this.time = time;
		this.name = name;
		this.soundResId = soundResId;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setTime(String time){
		this.time = time;
	}
	public void setSoundResId(int soundResId){
		this.soundResId = soundResId;
	}
	
	public String getName(){
		return this.name;
	}
	public String getTime(){
		return this.time;
	}
	public int getSoundResId(){
		return  this.soundResId;
	}
	public void  run(){
		this.active = true;
	}
	public void  cancel(){
		this.active = false;
	}
	
	

}
