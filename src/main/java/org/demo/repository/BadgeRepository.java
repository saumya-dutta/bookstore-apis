/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.repository;

import org.demo.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for Badge.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Repository
public interface BadgeRepository  extends JpaRepository<Badge, Integer>, JpaSpecificationExecutor<Badge> {}