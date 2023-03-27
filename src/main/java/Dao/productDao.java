package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.product;
import connection.DbCon;


public class productDao {
	Connection con = null;
//	 để thực hiện các truy vấn được tham số hóa
	PreparedStatement pst = null; 
//	 sử dụng để thực thi các truy vấn SQL 
	ResultSet rs = null;
	public List<product> selectProduct() {
		List<product> list = new ArrayList<>();
//Truy vấn dữ liệu với câu truy vấn lấy từ MySQL
		String sql = "Select * from product;";
		try {
			con = DbCon.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
//lấy từng trường dữ liệu trong Model			
			while (rs.next()) {
				product p= new product();
				p.setId(rs.getInt("id"));
				p.setImage(rs.getString("image"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getString("price"));
				p.setCategory(rs.getString("category"));
				p.setDescription(rs.getString("decription"));
				p.setQuatity(rs.getString("quatity"));
				

				
				list.add(p);
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return list;
	}
//	Viết hàm main để test dữ liệu đã được lấy thành công hay chưa
	public static void main(String[] args) {
		productDao dao= new productDao();
		List<product>list=dao.selectProduct();
		System.out.println(list);
	}
}
