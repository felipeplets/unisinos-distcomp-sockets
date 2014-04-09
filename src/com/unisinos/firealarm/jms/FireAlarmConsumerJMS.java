package com.unisinos.firealarm.jms;

import javax.jms.*;
import javax.naming.*;

public class FireAlarmConsumerJMS {
public String await(){
	try {
		Context ctx = new InitialContext();
		TopicConnectionFactory topicFactory = (TopicConnectionFactory)ctx.lookup("TopicConnectionFactory");
		Topic topic = (Topic)ctx.lookup("Alarms");
		TopicConnection topicConn = topicFactory.createTopicConnection();
		TopicSession topicSess = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSubscriber topicSub = topicSess.createSubscriber(topic);
		TextMessage msg = (TextMessage) topicSub.receive();
		return msg.getText();
	} catch (Exception ex) {
		return null;
	}
}
}
