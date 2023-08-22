package com.example;

import java.util.Map;

public class SimpleDto {
	private Map<String, String> tags;

	public SimpleDto() {

	}

	public Map<String, String> getTags() {
		return tags;
	}

	public void setTags(Map<String, String> tags) {
		this.tags = tags;
	}

}