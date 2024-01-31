package com.renters.checklist.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CHECKLISTB")
public class ChecklistB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CHECKLIST_ID")
	private long id;
	
	@Column(name="ITEM")
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
