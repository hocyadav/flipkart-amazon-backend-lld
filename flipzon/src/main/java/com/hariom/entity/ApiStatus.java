package com.hariom.entity;

import com.hariom.util.Status;

public class ApiStatus {
	String apiName;
	String apiStatus;
	public ApiStatus(String apiName, Status apiStatus) {
		super();
		this.apiName = apiName;
		this.apiStatus = apiStatus.name();
	}
	
	public ApiStatus() {
		super();
	}
	
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiStatus() {
		return apiStatus;
	}
	public void setApiStatus(String apiStatus) {
		this.apiStatus = apiStatus;
	}
	
}
