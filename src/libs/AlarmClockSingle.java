package libs;

import libs.AlarmClock;

public class AlarmClockSingle extends AlarmClock {

	public AlarmClockSingle(String time) {
		super(time);
	}
	public AlarmClockSingle(String time, String name) {
		super(time, name);
	}
	public AlarmClockSingle(String time, String name, int soundResId) {
		super(time, name, soundResId);
	}

}
