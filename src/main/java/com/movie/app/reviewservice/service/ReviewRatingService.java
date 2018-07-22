package com.movie.app.reviewservice.service;

import java.util.List;

import com.movie.app.reviewservice.model.ReviewRatingDetails;

public interface ReviewRatingService {

	List<ReviewRatingDetails> getAllReviewRatingDetailLists();

	ReviewRatingDetails getReviewRatingDetails(Integer reviewId);

}
