package com.unisinos.firealarm.jg;

import org.jgroups.JChannel;
import org.jgroups.Message;

public class FireAlarmConsumerJG {
	public String await() {
		try {
			JChannel channel = new JChannel();
			channel.connect("AlarmChannel");
			Message msg = (Message) channel.receive(0);
			return (String) msg.getObject();
		} catch (Exception ex) {
			return null;
		}
	}

}
