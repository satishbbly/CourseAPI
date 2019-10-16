package com.java.springboot.model;

public class Topic {
private String id;
private String name;
private String desc;
public String getId() {
	return id;
}
public Topic() {
	super();
	// TODO Auto-generated constructor stub
}
public Topic(String id, String name, String desc) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
}
