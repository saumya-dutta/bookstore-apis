/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service;

import java.util.Date;
import javax.persistence.*;

import org.demo.entity.Badge;
import org.demo.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Badge.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Service
public class BadgeServiceImpl implements BadgeService {

	@Autowired
	private BadgeRepository badgeRepository;

	@Override
	public Page<Badge> search(Pageable pageable) {
		return badgeRepository.findAll(pageable);
	}

	@Override
	public Badge get(Integer badgeNumber) {
		return badgeRepository.findById(badgeNumber).orElse(null);
	}

	@Override
	public Boolean delete(Integer badgeNumber) {
		if (badgeRepository.findById(badgeNumber) != null) {
			badgeRepository.deleteById(badgeNumber);
			return true;
		}
		return false;
	}

	@Override
	public Badge create(Badge badge) {
		return badgeRepository.save(badge);
	}

	@Override
	public Boolean save(Badge badge) {
		final Integer pk = badge.getBadgeNumber();
		if (badgeRepository.findById(pk) != null) {
			badgeRepository.save(badge);
			return true;
		}
		return false;
	}

	@Override
	public Boolean exist(Badge badge) {
		return badgeRepository.existsById(badge.getBadgeNumber());
	}


}

