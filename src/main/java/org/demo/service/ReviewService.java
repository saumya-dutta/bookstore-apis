/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:12 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service;

import org.demo.entity.Review;
import org.demo.service.criteria.ReviewCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Review.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public interface ReviewService {

	/**
	 * Perform a pageable and filtered search.
	 * @param pageable pagination configuration
	 * @param criteria filters
	 * @return a page of review
	 */
	public Page<Review> search(Pageable pageable, ReviewCriteria criteria);
	/**
	 * Recover an review following an id.
	 * @param id the given id
	 * @return the review
	 */
	public Review get(String customerCode, Integer bookId);

	/**
	 * Perform an review deletion.
	 * @param id the given id
	 * @return state of deletion (true if ok otherwise false)
	 */
	public Boolean delete(String customerCode, Integer bookId);

	/**
	 * Perform an review creation.
	 * @param review to create
	 * @return created review
	 */
	public Review create(Review review);

	/**
	 * Perform an review update.
	 * @param review to update
	 * @return state of update (true if ok otherwise false)
	 */
	public Boolean save(Review review);

	/**
	 * Test review existence.
	 * @param review to check
	 * @return true if author exist otherwise false
	 */
	public Boolean exist(Review review);
}