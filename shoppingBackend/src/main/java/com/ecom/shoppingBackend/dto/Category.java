package com.ecom.shoppingBackend.dto;

public class Category {
	
	private int id;
	private String name;
	private String description;
	private String imageurl;
	private boolean active;
	public Category() {
		super();
	}
	public Category(int id, String name, String description, String imageurl, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageurl = imageurl;
		this.active = active;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl
				+ ", active=" + active + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
