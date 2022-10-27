package com.gdu.app01.xml06;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	// field
	private List<String> hobbies;
	private Set<String> contacts;
	private Map<String, String> friend;
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Set<String> getConttacts() {
		return contacts;
	}
	public void setConttacts(Set<String> conttacts) {
		this.contacts = conttacts;
	}
	public Map<String, String> getFriend() {
		return friend;
	}
	public void setFriend(Map<String, String> friend) {
		this.friend = friend;
	}
	
	public void info() {
		
		for(int i = 0; i < hobbies.size(); i++) {
			System.out.println(i + 1 + "번째 취미 : "+ hobbies.get(i));
		}
		for(String contact : contacts) {
			System.out.println(contact);
		}
		for(Map.Entry<String, String> entry :  friend.entrySet()  ) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
}
