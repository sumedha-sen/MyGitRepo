package com.tyss.jpaproj.bean;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="movies")
public class Movies implements Serializable {
	
	@Id
	@Column(name="mid")
	private int id;
	
	@Column(name="mname")
	private String name;
	
	@Column(name="ratings")
	private double rating;
	
	@Column(name="reviews")
	private String reviews;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	
	

}
