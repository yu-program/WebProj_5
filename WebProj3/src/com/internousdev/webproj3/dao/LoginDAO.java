package com.internousdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj3.dto.LoginDTO;
import com.internousdev.webproj3.util.DBConnector;

public class LoginDAO {

	public String username;
	public String password;

//LoginDTO型を最後に呼び出し元に渡すため、LoginDTO型を戻り値にするメソッドを作成する。
	public LoginDTO select(String username,String password){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select * from users where user_name=? and password=?";

		try {
		//PreparedStatementはDBまで値を運んでくれる箱のイメージ
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
//select文を実行する(executeQuery())と必ず戻り値はResultSetが返ってくる。
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
			//select文で取得した情報をString型に変換(setString(""))してDTOクラスに格納する。
			//LoginDTOクラスのsetName,setPasswordを利用している。(dtoをどこからインスタンスしているのか見ればわかる)
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}else {
				dto.setUsername("該当なし");
				dto.setPassword("該当なし");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		//dtoに入った値を呼び出し元であるActionクラスに返す。
		return dto;
	}
}
