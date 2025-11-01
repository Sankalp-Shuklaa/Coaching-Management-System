package com.cms.model;

public class Event {
	protected int Eid;
	protected String EventName;
	protected String Event_description;
	protected String Event_Date;
	public Event(int eid, String eventName, String event_description, String event_Date) {
		super();
		Eid = eid;
		EventName = eventName;
		Event_description = event_description;
		Event_Date = event_Date;
	}
	public Event(String eventName, String event_description, String event_Date) {
		super();
		EventName = eventName;
		Event_description = event_description;
		Event_Date = event_Date;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getEvent_description() {
		return Event_description;
	}
	public void setEvent_description(String event_description) {
		Event_description = event_description;
	}
	public String getEvent_Date() {
		return Event_Date;
	}
	public void setEvent_Date(String event_Date) {
		Event_Date = event_Date;
	}
	
	
}
