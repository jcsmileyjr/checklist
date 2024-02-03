package com.renters.checklist.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CHECKLISTA")
public class ChecklistA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CHECKLIST_ID")
	private long id; // Schema: CHECKLIST_ID BIGSERIAL PRIMARY KEY
	
	public ChecklistA() {
		super();
	}
	
	public ChecklistA(String item) {
		super();
		this.item = item;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="ITEM")
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ChecklistA [id=" + id + ", item=" + item + "]";
	}
	
	
	
}
