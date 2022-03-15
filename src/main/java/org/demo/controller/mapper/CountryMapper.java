/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller.mapper;

import java.util.List;

import org.demo.controller.resource.CountryResource;
import org.demo.entity.Country;

import fr.xebia.extras.selma.Mapper;

/**
 * CountryResource's Mapper declaration using selma.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Mapper(withIgnoreFields = { "id", "links" })
public interface CountryMapper {

	// This will build a fresh new CountryResource with in infos
	CountryResource map(Country in);

	Country map(CountryResource in);

	// This will update the given Author
	Country map(CountryResource in, Country out);

	// this will build a fresh list of CountryResource with in infos
	List<CountryResource> map(List<Country> in);
}
