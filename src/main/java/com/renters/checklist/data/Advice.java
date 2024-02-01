package com.renters.checklist.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ADVICE")
public class Advice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ADVICE_ID")
	private long id; // Schema: ADVICE_ID BIGSERIAL PRIMARY KEY

	@Column(name="ADVICE")
	private String advice; // Schema: CONTENT VARCHAR(127)
	
	@Column(name="LIKES")
	private int likes;

	
	public Advice() {
		super();
	}

	public Advice(String advice, int likes) {
		super();
		this.advice = advice;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Advice [id=" + id + ", advice=" + advice + ", likes=" + likes + "]";
	}


	
}
