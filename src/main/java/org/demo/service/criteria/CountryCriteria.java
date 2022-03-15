/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for Country search.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public class CountryCriteria {

    private String name; 
	// Constructor
	public CountryCriteria() {
		// Needed empty constructor for serialization
	}

	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(name); 
        return sb.toString();
	}
}