/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service;

import org.demo.entity.Badge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Badge.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public interface BadgeService {

	/**
	 * Perform a pageable and filtered search.
	 * @param pageable pagination configuration
	 * @return a page of badge
	 */
	public Page<Badge> search(Pageable pageable);
	/**
	 * Recover an badge following an id.
	 * @param id the given id
	 * @return the badge
	 */
	public Badge get(Integer badgeNumber);

	/**
	 * Perform an badge deletion.
	 * @param id the given id
	 * @return state of deletion (true if ok otherwise false)
	 */
	public Boolean delete(Integer badgeNumber);

	/**
	 * Perform an badge creation.
	 * @param badge to create
	 * @return created badge
	 */
	public Badge create(Badge badge);

	/**
	 * Perform an badge update.
	 * @param badge to update
	 * @return state of update (true if ok otherwise false)
	 */
	public Boolean save(Badge badge);

	/**
	 * Test badge existence.
	 * @param badge to check
	 * @return true if author exist otherwise false
	 */
	public Boolean exist(Badge badge);
}
