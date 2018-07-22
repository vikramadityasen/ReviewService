package com.movie.app.reviewservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.reviewservice.model.ReviewRatingDetails;
import com.movie.app.reviewservice.repository.ReviewRatingRepository;
import com.movie.app.reviewservice.service.ReviewRatingService;

@Service
public class ReviewRatingServiceImpl implements ReviewRatingService {

	@Autowired
	ReviewRatingRepository reviewRatingRepository;

	@Override
	public List<ReviewRatingDetails> getAllReviewRatingDetailLists() {
		return reviewRatingRepository.findAll();
	}

}
