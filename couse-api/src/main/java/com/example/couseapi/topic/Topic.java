package com.example.couseapi.topic;

public class Topic {

	
	private String id;
	private String name;
	private String descroption;
	
	public Topic() {
		
		
	}
	
	public Topic(String id, String name, String descroption) {
		super();
		this.id = id;
		this.name = name;
		this.descroption = descroption;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescroption() {
		return descroption;
	}
	public void setDescroption(String descroption) {
		this.descroption = descroption;
	}
	
}
