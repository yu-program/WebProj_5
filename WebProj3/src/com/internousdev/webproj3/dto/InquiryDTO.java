package com.internousdev.webproj3.dto;

public class InquiryDTO {

	private String name;
	private String qtype;
	private String body;

//getter,setterの定義。
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public String getBody() {
		return body;
	}
	public void setbody(String body) {
		this.body = body;
	}
}
