package com.example.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Menu {

	private String title;
	private String name;
	private String path;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Menu [title=" + title + ", name=" + name + ", path=" + path + "]";
	}
}
