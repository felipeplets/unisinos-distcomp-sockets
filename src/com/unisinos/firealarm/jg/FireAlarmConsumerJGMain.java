package com.unisinos.firealarm.jg;

public class FireAlarmConsumerJGMain {

	public static void main(String[] args) {
		FireAlarmConsumerJG alarmCall = new FireAlarmConsumerJG();
		String str = alarmCall.await();
		System.out.println("Alarm received: " + str);
	}

}
