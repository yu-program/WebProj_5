package com.internousdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj3.dto.HelloStrutsDTO;
import com.internousdev.webproj3.util.DBConnector;

public class HelloStrutsDAO {
//HelloStrutsDTO型を最後に呼び出し元に渡すため、HelloStrutsDTO型を戻り値にするメソッドを作成する。
//そのため、Actionクラスの値を引数として受け取る。
	public HelloStrutsDTO select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		HelloStrutsDTO dto = new HelloStrutsDTO();

		String sql = "select * from users";

		try {
//PreparedStatementはDBまで値を運んでくれる箱のイメージ
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println();

			if(rs.next()) {
//接続できているか確認したいのでresultの中身は特に確認できなくて良い。
				dto.setResult("MySQLと接続できます。");
			}else {
				dto.setResult("MySQLと接続できません。");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
//dtoに入った値を呼び出し元であるActionクラスに返す。
		return dto;
	}
}