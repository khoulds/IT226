package Asg2;

import java.time.LocalDateTime;
import java.time.temporal.*;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
	private String message;
	private LocalDateTime stopTime;
	private int numSnoozes;
	private int time;
	
	public void startTimer() {
		Timer timer = new Timer();
		int inSec = this.time * 1000;
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				triggerAlarm();
			}
		}, inSec);
	}
	
	//added two constructors
	public Alarm(int time)
	{
		//this should be passed in in seconds. 
		this.time = time;
	}
	
	public Alarm(String message, LocalDateTime stopTime)
	{
		this.message = message;
		this.stopTime = stopTime;
		LocalDateTime now = LocalDateTime.now();
		int time = (int) (now.until(stopTime, ChronoUnit.MILLIS ));
		this.time = time;
	}
	
	// Matt
	public void triggerAlarm() {
		
	}
	
	// Kevin
	public void snooze() {
		this.time = (int)(.06);
		this.startTimer();
		numSnoozes++;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public double getTime()
	{
		return this.time;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getStopTime() {
		return stopTime;
	}

	public void setStopTime(LocalDateTime stopTime) {
		this.stopTime = stopTime;
	}

	public int getNumSnoozes() {
		return numSnoozes;
	}

	public void setNumSnoozes(int numSnoozes) {
		this.numSnoozes = numSnoozes;
	}
}
