package com.gd.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gd.model.Songs;

public class SongsDaoImpl {

	private JdbcTemplate jdbcTemplate;

	public SongsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public SongsDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int save(Songs s) {
		String sql = "INSERT INTO songs(Sname, DOR, Artists, Rating) VALUES(?,?,?,?)";
		return jdbcTemplate.update(sql, s.getSongName(), s.getDateOfRelease(), s.getArtist(), s.getRating());
	}

	public List<Songs> list() {
		String sql = "SELECT * FROM songs ORDER By Rating DESC LIMIT 10";
		RowMapper<Songs> rowMapper = new RowMapper<Songs>() {

			public Songs mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id = rs.getInt("S_id");
				String Sname = rs.getString("Sname");
				String DOR = rs.getString("DOR");
				String Artists = rs.getString("Artists");
				int Rating = rs.getInt("Rating");
				return new Songs(id, Sname, DOR, Artists, Rating);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

}
