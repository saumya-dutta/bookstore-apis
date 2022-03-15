/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:11 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller;

import org.demo.controller.assembler.EmployeeResourceAssembler;
import org.demo.controller.resource.EmployeeResource;
import org.demo.entity.Employee;
import org.demo.service.EmployeeServiceImpl;
import org.demo.service.criteria.EmployeeCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller which produce Hal+json content (including hateoas metadata).
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@RestController
@RequestMapping(value = "/employee", produces = "application/hal+json")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private static final String NOT_FOUND ="Employee not found";

	@Autowired
	private EmployeeServiceImpl employeeService;

	@Autowired
	private PagedResourcesAssembler<Employee> pageAssember;

	private EmployeeResourceAssembler employeeResourceAssembler = new EmployeeResourceAssembler();

	@GetMapping
	public ResponseEntity<PagedResources<EmployeeResource>> search(Pageable pageable, EmployeeCriteria criteria) {
		LOGGER.info("Employees search [pageable={}|EmployeeCriteria={}", pageable, criteria);
		final Page<Employee> result = employeeService.search(pageable, criteria);
		LOGGER.info("Found {} employees !", result.getSize());
		return new ResponseEntity<>(pageAssember.toResource(result, employeeResourceAssembler), HttpStatus.OK);
	}

	@GetMapping("{code}")
	public ResponseEntity<EmployeeResource> get(@PathVariable("code") String code) {
		LOGGER.info("Employee get with id {}", resolveIdForLogger(code));
		final Employee employee = employeeService.get(code);
		if (employee == null) {
			LOGGER.info(NOT_FOUND);
			return new ResponseEntity<>((EmployeeResource) null, HttpStatus.NOT_FOUND);
		}
		LOGGER.info("Employee found : {}", employee);
		final EmployeeResource employeeResource = employeeResourceAssembler.toResource(employee);
		return new ResponseEntity<>(employeeResource, HttpStatus.OK);
	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<EmployeeResource> create(@RequestBody Employee employee) {
		LOGGER.info("Employee creation request : {}", employee);
		if (employeeService.exist(employee)) {
			LOGGER.info("Employee already exist ! : {}", employee);
			return new ResponseEntity<>((EmployeeResource) null, HttpStatus.CONFLICT);
		} else {
			final Employee created = employeeService.create(employee);
			LOGGER.info("Created employee {}", created);
			return new ResponseEntity<>(employeeResourceAssembler.toResource(created), HttpStatus.OK);
		}
	}

	@PutMapping(value = "{code}", consumes = "application/json")
	public ResponseEntity<Void> update(@PathVariable("code") String code, @RequestBody Employee employee) {
		LOGGER.info("Employee update request [id={} | employee={}}", resolveIdForLogger(code), employee);
		// force the id (use the id provided by the URL)
		employee.setCode(code);
		if (employeeService.save(employee)) {
			LOGGER.info("Employee succesfully updated");
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			LOGGER.info(NOT_FOUND);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("{code}")
	public ResponseEntity<Void> delete(@PathVariable("code") String code) {
		LOGGER.info("Employee deletion request : {}", resolveIdForLogger(code));
		if (employeeService.delete(code)) {
			LOGGER.info("Employee succesfully deleted");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			LOGGER.info(NOT_FOUND);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	private String resolveIdForLogger(String code) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(code));
		return ids.toString();
	}

}
