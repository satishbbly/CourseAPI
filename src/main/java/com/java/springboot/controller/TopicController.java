package com.java.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List l=new ArrayList<Topic>();
		 l.add(new Topic("java", "Java", "Core Java Description"));
		 l.add(new Topic("java Script", "Java Script", "Java Script Description"));
		 l.add(new Topic("spring", "Spring", "Spring Framework Description"));
		 return l;
	}
}
