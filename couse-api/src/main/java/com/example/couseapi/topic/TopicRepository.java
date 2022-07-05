package io.javabrains.topic;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.course.Course;

public interface TopicRepository extends CrudRepository<Topic,String>{

	//getAllTopics(
	//getTopic(String id)
	//updataTopic(Topic t)
	//deleteTopicString id)
	
}
