/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:12 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for Synopsis search.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public class SynopsisCriteria {

    private String synopsis; 
	// Constructor
	public SynopsisCriteria() {
		// Needed empty constructor for serialization
	}

	public void setSynopsis(String synopsis) {this.synopsis = synopsis;}
	public String getSynopsis() {return this.synopsis;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(synopsis); 
        return sb.toString();
	}
}
