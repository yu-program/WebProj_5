package com.internousdev.webproj2.action;

import com.internousdev.webproj2.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;

	public String execute() {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
//select()で次に遷移するページがきまる。booleanで判別。
		boolean b =dao.select(username, password);

		if(b == true) {
			ret = SUCCESS;
		}else {
			ret = ERROR;
		}
	return ret;
	}

//getter,setterの定義。
	public String getUsername (){
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}