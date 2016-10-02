package com.prachi.common.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prachi.common.dao.M2000Dao;
import com.prachi.common.model.M2000;



@Repository
public class M2000DaoImpl implements M2000Dao {
	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<M2000> listAll() {
		List<M2000> m2List = new ArrayList<M2000>();
		String sql = "SELECT * FROM m2000";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				M2000 m = new M2000(rs.getInt("pnum"), rs.getString("status"), rs.getInt("race"), rs.getInt("weight"), rs.getInt("height"), rs.getInt("is_veg"));
				m2List.add(m);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return m2List;
	}

}
