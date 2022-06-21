package com.gd.model;

public class Songs {
	private Integer id;
	private String songName;
	private String dateOfRelease;
	private String artist;
	private Integer rating;

	public Songs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Songs(Integer id, String songName, String dateOfRelease, String artist, Integer rating) {
		super();
		this.id = id;
		this.songName = songName;
		this.dateOfRelease = dateOfRelease;
		this.artist = artist;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", songName=" + songName + ", dateOfRelease=" + dateOfRelease + ", artist=" + artist
				+ ", rating=" + rating + "]";
	}
}