package com.internousdev.webproj3.dto;

public class HelloStrutsDTO {

	private String result;

//getter,setterの定義。(DAOでselectされた値を格納することが役割のため。)
	public String getResult() {
		return result;
	}

	public void setResult (String result) {
		this.result = result;
	}
}
