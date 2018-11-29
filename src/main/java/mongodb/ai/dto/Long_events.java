package mongodb.ai.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
public class Long_events implements Serializable {

    @Id
    private String _id;

    private String domain;

    private List<Child_Events> child_events;

    private int num_story;

    private String event_id;

    private String event_name;

    private List<Articles>stories;

    private String date;
    
    private String event_count;


    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<Child_Events> getChild_events() {
        return child_events;
    }

    public void setChild_events(List<Child_Events> child_events) {
        this.child_events = child_events;
    }

    public int getNum_story() {
        return num_story;
    }

    public void setNum_story(int num_story) {
        this.num_story = num_story;
    }

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

    public List<Articles> getStories() {
        return stories;
    }

    public void setStories(List<Articles> stories) {
        this.stories = stories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

	public String getEvent_count() {
		return event_count;
	}

	public void setEvent_count(String event_count) {
		this.event_count = event_count;
	}

}
