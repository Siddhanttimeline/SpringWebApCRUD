package com.gd.model;

public class Artists {
	private Integer id;
	private String artistName;
	private String datOfBirth;
	private String bioData;
	public Artists() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artists(Integer id, String artistName, String datOfBirth, String bioData) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.datOfBirth = datOfBirth;
		this.bioData = bioData;
	}
	@Override
	public String toString() {
		return "Artists [id=" + id + ", artistName=" + artistName + ", datOfBirth=" + datOfBirth + ", bioData="
				+ bioData + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getDatOfBirth() {
		return datOfBirth;
	}
	public void setDatOfBirth(String datOfBirth) {
		this.datOfBirth = datOfBirth;
	}
	public String getBioData() {
		return bioData;
	}
	public void setBioData(String bioData) {
		this.bioData = bioData;
	}
}