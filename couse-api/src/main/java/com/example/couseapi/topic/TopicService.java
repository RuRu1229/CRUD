package com.example.couseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {
	public List<Topic> topics= Arrays.asList(
				new Topic("Spring","Spring Framework","spring Framework Description"),
				new Topic("java","Core java","Core java Description"),
				new Topic("javaScript","javaScript","javaScript Description")
				//new Topic("Spring","Spring Framework","spring Framework Description")
				);
	public List<Topic> getAllTopics(){
		return topics;
	
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i < topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public Topic delectTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		return null;
	}
}
