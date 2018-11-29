package mongodb.ai.dto;

import java.io.Serializable;
import java.util.List;


public class Child_Events implements Serializable {
	
	private String event_id;
	
	private String event_name;

	private String date;

	private int num_story;

	private List<Stories> stories;

 	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNum_story() {
		return num_story;
	}

	public void setNum_story(int num_story) {
		this.num_story = num_story;
	}

	public List<Stories> getStories() {
		return stories;
	}

	public void setStories(List<Stories> stories) {
		this.stories = stories;
	}
}
