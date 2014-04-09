package com.unisinos.firealarm.jg;

import org.jgroups.JChannel;
import org.jgroups.Message;

public class FireAlarmJG {
	public void raise() {
		try {
			JChannel channel = new JChannel();
			channel.connect("AlarmChannel");
			Message msg = new Message(null, null, "Fire");
			channel.send(msg);
		} catch (Exception ex) {
		}
	}
}