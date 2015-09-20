package com.example.wakeup;

import android.app.Activity;

import android.content.Context;

import android.os.Bundle;

import android.view.Menu;

import android.view.View;

import android.widget.Toast;

import com.example.wakeup.AlarmManagerBroadcastReceiver;



public class MainActivity extends Activity {



	private AlarmManagerBroadcastReceiver alarm;
	private Context context;
	
	
	
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
	
	    super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.activity_main);
	
	    this.alarm = new AlarmManagerBroadcastReceiver();
	    this.context = this.getApplicationContext();
	
	}
	
	
	
	@Override
	
	protected void onStart() {
	
	    super.onStart();
	
	}
	
	
	
	public void startRepeatingTimer(View view) {
	
	    	this.alarm.SetAlarm(this.context);
	    	//aaaa33
	
	}
	
	
	
	public void cancelRepeatingTimer(View view) {
	
	    	this.alarm.CancelAlarm(this.context);
	
	}
	
	
	
	public void onetimeTimer(View view) {
	
	    	this.alarm.setOnetimeTimer(this.context);
	
	}

}
