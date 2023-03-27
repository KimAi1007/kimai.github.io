package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import Model.accounts;
import Model.product;
import connection.DbCon;

public class accountsDao {
	private static final long serialVersionUID = 1L;

	public accounts checkLogin(String username, String password) {
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rs = null;

		try {
			con = DbCon.getConnection();
			if (con != null) {
				String sql = "SELECT * FROM accounts where username=? and password=?";
				pre = con.prepareStatement(sql);
				pre.setString(1, username);
				pre.setString(2, password);

				rs = pre.executeQuery();
				while (rs.next()) {
					return new accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)); 
				}
			}

		} catch(Exception e) {			
		}
		return null;
	}

	public accounts checkAccount(String username) {
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rs = null;

		try {
			con = DbCon.getConnection();
			if (con != null) {
			String sql = "SELECT * FROM accounts where username=?";
			pre = con.prepareStatement(sql);
				pre.setString(1, username);

				rs = pre.executeQuery();
				while (rs.next()) {
					return new accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)); 
				}
			}

				} catch(Exception e) {			
				}
				return null;
			}
	public static void main(String[] args) {
accountsDao dao= new accountsDao();
accounts c = dao.checkAccount("Ai");
		System.out.println(c);
	}
}