package com.gdu.app01.java02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean
	public Student stud() { // <bean id="Student" class="stud">
		
		List<Integer> scores = new ArrayList<Integer>();
		for(int cnt = 0; cnt < 5; cnt++) {
			scores.add( (int)(Math.random() * 101)  );
		}
		
		Set<String> awards = new HashSet<String>();
		awards.add("개근상");
		awards.add("장려상");
		awards.add("우수상");
		
		Map<String, String> contact = new HashMap<String, String>();
		contact.put("address", "서울");
		contact.put("tel","02-123-4567");
		
		
		
		 // Bean 생성 및 반환
	      Student student = new Student();
	      student.setScores(scores);
	      student.setAwards(awards);
	      student.setContact(contact);
	      return student;
		
	}
	
	
	
	
}
