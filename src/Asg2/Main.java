package Asg2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDate;

public class Main {

	public ArrayList<Alarm> alarms = new ArrayList<Alarm>();

	// Kevin/Randy
	public static void initiateAll(ArrayList<Alarm> alarms) {
		//read from file and fill list
		for(Alarm alarm : alarms)
		{
			LocalDateTime dateTime = LocalDateTime.now();
			LocalDateTime alarmStopTime = alarm.getStopTime();
			if(alarmStopTime.isBefore(dateTime))
			{
				alarm.triggerAlarm();
			}
		}
	}

	// Matt
	public static void displayUI() {

	}

	// Kevin
	public static void addAlarm(ArrayList<Alarm> alarms, Alarm alarm) {
		alarms.add(alarm);
		alarm.startTimer();
	}

	// Randy
	private static void writeAlarm() {

	}

	// Randy
	private static void writeAll() {

	}

	// Kevin
	public static void removeAlarm(Alarm alarm, ArrayList<Alarm> alarms) {
		
	}

	public static void main(String[] args) {
		 LocalDate now = LocalDate.now();
		 LocalDateTime dtnow = LocalDateTime.now();
		
		 LocalDateTime then = dtnow.plusMinutes(30);
		 if (dtnow.isAfter(then)) {
		 System.out.println("is after");
		 } else {
		 System.out.println("is before");
		 }

//		Timer timer = new Timer();
//		Alarm alarm = new Alarm();
//		alarm.startTimer(2);

//		initiateAll();
//		displayUI();
	}
}
