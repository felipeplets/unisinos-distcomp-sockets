package com.unisinos.firealarm.jms;

public class FireAlarmJMSMain {

	public static void main(String[] args) {
		while (true) {
			FireAlarmJMS alarm = new FireAlarmJMS();
			alarm.raise();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
