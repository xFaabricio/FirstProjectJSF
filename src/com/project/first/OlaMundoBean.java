package com.project.first;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
