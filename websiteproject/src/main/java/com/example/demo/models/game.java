package com.example.demo.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@Column
	private String name;
	@Lob @Basic(fetch = FetchType.LAZY) @Column(length = 3000) 
	private String description;
	@Lob @Basic(fetch = FetchType.LAZY) @Column(length = 3000) 
	private String picture;
	@Column
	private int alike;
	@Column
	private int adislike;
	@Lob @Basic(fetch = FetchType.LAZY) @Column(length = 3000) 
	private String download;
	public game() {}
	public game(int id, String name, String description, String picture, int like, int dislike, String download) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.picture = picture;
		this.alike = like;
		this.adislike = dislike;
		this.download = download;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public int getAlike() {
		return alike;
	}
	public void setAlike(int alike) {
		this.alike = alike;
	}
	public int getAdislike() {
		return adislike;
	}
	public void setAdislike(int adislike) {
		this.adislike = adislike;
	}
	public String getDownload() {
		return download;
	}
	public void setDownload(String download) {
		this.download = download;
	}
	
	
	
	

}
