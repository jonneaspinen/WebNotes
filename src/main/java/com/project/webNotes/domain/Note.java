package com.project.webNotes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;
	private String content;
	private String date;

	@ManyToOne
	@JoinColumn(name = "note")
	private Urgency urgency;

	public Note() {

	}

	public Note(String content, String date, Urgency urgency) {
		super();
		this.content = content;
		this.date = date;
		this.urgency = urgency;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Urgency getUrgency() {
		return urgency;
	}

	public void setUrgency(Urgency urgency) {
		this.urgency = urgency;
	}

	@Override
	public String toString() {
		if (this.urgency != null)
			return "Note [id=" + id + ", content=" + content + ", date=" + date + " urgency=" + this.getUrgency() + "]";
		else
			return "Note [id=" + id + ", content=" + content + ", date=" + date + "]";
	}
}
