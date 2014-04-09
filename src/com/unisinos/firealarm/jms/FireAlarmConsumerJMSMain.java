package com.unisinos.firealarm.jms;

public class FireAlarmConsumerJMSMain {

	public static void main(String[] args) {
		while (true) {
			FireAlarmConsumerJMS alarmCall = new FireAlarmConsumerJMS();
			String msg = alarmCall.await();
			System.out.println("Alarm received: " + msg);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
