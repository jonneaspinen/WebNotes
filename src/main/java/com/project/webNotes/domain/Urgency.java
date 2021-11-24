package com.project.webNotes.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Urgency {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long urgencyid;
	private String importance;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "urgency")
	private List<Note> notes;

	public Urgency() {

	}

	public Urgency(String importance) {
		super();
		this.importance = importance;
	}

	public Urgency(String importance, List<Note> notes) {
		super();
		this.importance = importance;
		this.notes = notes;
	}

	public long getUrgencyid() {
		return urgencyid;
	}

	public void setUrgencyid(long urgencyid) {
		this.urgencyid = urgencyid;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Urgency [urgencyid=" + urgencyid + ", importance=" + importance + "]";
	}

}
