package com.unisinos.firealarm.jms;

import javax.jms.*;
import javax.naming.*;

public class FireAlarmJMS {
	public void raise() {
		try {
			Context ctx = new InitialContext();
			TopicConnectionFactory topicFactory = (TopicConnectionFactory)ctx.lookup("TopicConnectionFactory");
			Topic topic = (Topic)ctx.lookup("Alarms");
			TopicConnection topicConn = topicFactory.createTopicConnection();
			TopicSession topicSess = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			TopicPublisher topicPub = topicSess.createPublisher(topic);
			TextMessage msg = topicSess.createTextMessage();
			msg.setText("Fire!");
			topicPub.publish(msg);
		} catch (Exception ex) {}
	}
}
