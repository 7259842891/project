package com.niit.model;

import javax.persistence.Entity;

@Entity
public class category {
	
		private int ID;
		private String name;
		private String description;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

	

}
