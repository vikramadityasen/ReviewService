package com.movie.app.reviewservice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.reviewservice.model.ReviewRatingDetails;
import com.movie.app.reviewservice.service.ReviewRatingService;

@RestController
@RequestMapping("/user")
public class ReviewRatingController {

	@Autowired
	ReviewRatingService reviewRatingService;

	@GetMapping("/getReviewRatingDetailLists")
	public List<ReviewRatingDetails> getAllReviewRatingDetailLists() {
		return reviewRatingService.getAllReviewRatingDetailLists();
	}
}
