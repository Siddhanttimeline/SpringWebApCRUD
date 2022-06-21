package com.gd.dao;

 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gd.model.Artists;


public class ArtistsDaoImpl {

	private JdbcTemplate jdbcTemplate;

	
	public ArtistsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public ArtistsDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

 
	public int save(Artists a) {
		String sql = "INSERT INTO artists(Aname, DOB, bio) VALUES(?,?,?)";
		return jdbcTemplate.update(sql, a.getArtistName(), a.getDatOfBirth(), a.getBioData());
	}

  
	public List<Artists> list() {
		String sql = "SELECT * FROM artists";
		RowMapper<Artists> rowMapper = new RowMapper<Artists>() {

			public Artists mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id = rs.getInt("A_id");
				String Aname = rs.getString("Aname");
				String DOB = rs.getString("DOB");
				String bio = rs.getString("bio");
				return new Artists(id, Aname, DOB, bio);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

}
