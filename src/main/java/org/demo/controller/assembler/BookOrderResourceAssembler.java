/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.demo.controller.BookOrderController;
import org.demo.controller.mapper.BookOrderMapper;
import org.demo.controller.resource.BookOrderResource;
import org.demo.entity.BookOrder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import fr.xebia.extras.selma.Selma;

/**
 * Hateoas assembler class which make mapping and adding hateoas links.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public class BookOrderResourceAssembler extends ResourceAssemblerSupport<BookOrder, BookOrderResource> {

	// declare the mapper
	private BookOrderMapper bookOrderMapper;

	public BookOrderResourceAssembler() {
		super(BookOrderController.class, BookOrderResource.class);
		bookOrderMapper = Selma.builder(BookOrderMapper.class).build();
	}

	@Override
	public BookOrderResource toResource(BookOrder bookOrder) {
		// Basic mapping
		final BookOrderResource resource = bookOrderMapper.map(bookOrder);
		resource.setId(bookOrder.getId());

		// adding hateoas links
		resource.add(linkTo(BookOrderController.class).slash(bookOrder.getId()).withSelfRel());
		return resource;
	}

}