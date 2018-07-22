package com.movie.app.reviewservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.reviewservice.model.ReviewRatingDetails;

@Repository
public interface ReviewRatingRepository extends JpaRepository<ReviewRatingDetails, Integer> {

}
