package libs.adapters;
import libs.AlarmClock;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AlarmClockArrayAdaper extends ArrayAdapter<AlarmClock> {
	
	Context context; 
    int layoutResourceId;    
    AlarmClock AlarmClocks[] = null;

	public AlarmClockArrayAdaper(Context context, int layoutResourceId, AlarmClock[] AlarmClocks) {
		super(context, layoutResourceId, AlarmClocks);
		
		this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.AlarmClocks = AlarmClocks;
	}

	 public View getView(int position, View convertView, ViewGroup parent) {
	        View row = convertView;
	        AlarmClockHolder holder = null;
	 
	        if(row == null)
	        {
	            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
	            row = inflater.inflate(android.R.layout.list_item_alarm_clock, parent, false);
	 
	            holder = new AlarmClockHolder();
	            holder.name = (TextView)row.findViewById(android.R.id.name);
	            holder.time = (TextView)row.findViewById(android.R.id.time);
	 
	            row.setTag(holder);
	        }
	        else	
	        {
	            holder = (AlarmClockHolder)row.getTag();
	        }
	 
	        AlarmClock ac = getItem(position);
	        holder.name.setText(AlarmClock.getName);
	        holder.time.setText(AlarmClock.getTime);
	 
	        return row;
	    }
	 
	 static class AlarmClockHolder
	 {
		 TextView name;
		 TextView time;
		 TextView[] weekdays;
	 }
}


