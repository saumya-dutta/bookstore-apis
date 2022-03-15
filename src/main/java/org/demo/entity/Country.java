/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Persistent class for Country entity stored in table COUNTRY.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Entity
@Table(name="COUNTRY", schema="ROOT" )
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="CODE", nullable=false, length=2)
    private String code ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", length=45)
    private String name ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Country() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setCode(String code) {
        this.code = code ;
    }
	public String getCode() {
        return this.code;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : NAME (VARCHAR) 
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(code); 
		sb.append(name); 
        return sb.toString();
    }
}