package com.movie.app.reviewservice.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReviewRatingDetails {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reviewId;
	@Column
	private Integer userId;
	@Column
	private String movieName;
	@Column
	private Float rating;
	@Column
	private Date ratingDate;
	@Column
	private String reviewcomments;

	@Override
	public String toString() {
		return "ReviewRatingDetails [reviewId=" + reviewId + ", userId=" + userId + ", movieName=" + movieName
				+ ", rating=" + rating + ", ratingDate=" + ratingDate + ", reviewcomments=" + reviewcomments + "]";
	}

	public ReviewRatingDetails() {
		super();
	}

	public ReviewRatingDetails(Integer reviewId, Integer userId, String movieName, Float rating, Date ratingDate,
			String reviewcomments) {
		super();
		this.reviewId = reviewId;
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
		this.ratingDate = ratingDate;
		this.reviewcomments = reviewcomments;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public String getRatingDate() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		return df.format(ratingDate);
	}

	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}

	public String getReviewcomments() {
		return reviewcomments;
	}

	public void setReviewcomments(String reviewcomments) {
		this.reviewcomments = reviewcomments;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
