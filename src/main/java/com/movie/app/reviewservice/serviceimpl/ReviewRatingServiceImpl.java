package com.movie.app.reviewservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.reviewservice.model.ReviewRatingDetails;
import com.movie.app.reviewservice.repository.ReviewRatingRepository;
import com.movie.app.reviewservice.service.ReviewRatingService;

import javassist.NotFoundException;

@Service
public class ReviewRatingServiceImpl implements ReviewRatingService {

	@Autowired
	ReviewRatingRepository reviewRatingRepository;

	@Override
	public List<ReviewRatingDetails> getAllReviewRatingDetailLists() {
		return reviewRatingRepository.findAll();
	}

	@Override
	public ReviewRatingDetails getReviewRatingDetails(Integer reviewId) {
		Optional<ReviewRatingDetails> reviewRatingDetail=reviewRatingRepository.findById(reviewId);
		if(!reviewRatingDetail.isPresent()) {
			try {
				throw new NotFoundException("ReviewId: "+reviewId);
			} catch (NotFoundException e) {
				e.printStackTrace();
			}
		}
		return reviewRatingDetail.get();
	}

}
