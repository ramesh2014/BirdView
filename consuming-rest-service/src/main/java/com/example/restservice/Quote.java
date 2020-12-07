package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	@JsonProperty("type")
	private String changedType;
	private Value value;
	
	public String getChangedType() {
		return changedType;
	}

	public void setChangedType(String changedType) {
		this.changedType = changedType;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}	

	public Quote() {
	}

	@Override
	public String toString() {
		return "Quote{" + "type='" + changedType + '\'' + ", value=" + value + '}';
	}

}
