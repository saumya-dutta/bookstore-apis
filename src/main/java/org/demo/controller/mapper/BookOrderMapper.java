/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller.mapper;

import java.util.List;

import org.demo.controller.resource.BookOrderResource;
import org.demo.entity.BookOrder;

import fr.xebia.extras.selma.Mapper;

/**
 * BookOrderResource's Mapper declaration using selma.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Mapper(withIgnoreFields = { "id", "links" })
public interface BookOrderMapper {

	// This will build a fresh new BookOrderResource with in infos
	BookOrderResource map(BookOrder in);

	BookOrder map(BookOrderResource in);

	// This will update the given Author
	BookOrder map(BookOrderResource in, BookOrder out);

	// this will build a fresh list of BookOrderResource with in infos
	List<BookOrderResource> map(List<BookOrder> in);
}
