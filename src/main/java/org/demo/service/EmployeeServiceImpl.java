/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:11 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service;

import javax.persistence.*;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.demo.entity.Employee;
import org.demo.repository.EmployeeRepository;
import org.demo.service.criteria.EmployeeCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Employee.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Page<Employee> search(Pageable pageable, EmployeeCriteria criteria) {
		return employeeRepository.findAll(new EmployeeSpecification(criteria), pageable);
	}

	@Override
	public Employee get(String code) {
		return employeeRepository.findById(code).orElse(null);
	}

	@Override
	public Boolean delete(String code) {
		if (employeeRepository.findById(code) != null) {
			employeeRepository.deleteById(code);
			return true;
		}
		return false;
	}

	@Override
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Boolean save(Employee employee) {
		final String pk = employee.getCode();
		if (employeeRepository.findById(pk) != null) {
			employeeRepository.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public Boolean exist(Employee employee) {
		return employeeRepository.existsById(employee.getCode());
	}

	class EmployeeSpecification implements Specification<Employee> {

		private EmployeeCriteria criteria;

		public EmployeeSpecification(EmployeeCriteria criteria) {
			this.criteria = criteria;
		}

		@Override
		public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
			final List<Predicate> predicates = new ArrayList<>();
			if (StringUtils.isNotBlank(criteria.getShopCode())) {
				predicates.add(builder.like(builder.lower(root.get("shopCode")),
						criteria.getShopCode().toLowerCase() + "%"));
			}
			if (StringUtils.isNotBlank(criteria.getFirstName())) {
				predicates.add(builder.like(builder.lower(root.get("firstName")),
						criteria.getFirstName().toLowerCase() + "%"));
			}
			if (StringUtils.isNotBlank(criteria.getLastName())) {
				predicates.add(builder.like(builder.lower(root.get("lastName")),
						criteria.getLastName().toLowerCase() + "%"));
			}
			if (StringUtils.isNotBlank(criteria.getEmail())) {
				predicates.add(builder.like(builder.lower(root.get("email")),
						criteria.getEmail().toLowerCase() + "%"));
			}
			return andTogether(predicates, builder);
		}

		private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder builder) {
			return builder.and(predicates.toArray(new Predicate[0]));
		}
	}

}

