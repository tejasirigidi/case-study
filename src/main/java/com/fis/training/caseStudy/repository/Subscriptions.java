package com.fis.training.caseStudy.repository;

import javax.persistence.*;

@Entity
public class Subscriptions {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "Subscriber_name")
	private String Subscriber_name;
	
	@Column(name = "Date_subscribed")
	private String Date_subscribed;
	
	@Column(name = "Date_returned")
	private String Date_returned;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubscriber_name() {
		return Subscriber_name;
	}

	public void setSubscriber_name(String subscriber_name) {
		Subscriber_name = subscriber_name;
	}

	public String getDate_subscribed() {
		return Date_subscribed;
	}

	public void setDate_subscribed(String date_subscribed) {
		Date_subscribed = date_subscribed;
	}

	public String getDate_returned() {
		return Date_returned;
	}

	public void setDate_returned(String date_returned) {
		Date_returned = date_returned;
	}

	
	

}
