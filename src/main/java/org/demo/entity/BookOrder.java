/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Persistent class for BookOrder entity stored in table BOOK_ORDER.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Entity
@Table(name="BOOK_ORDER", schema="ROOT" )
public class BookOrder implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="ID", nullable=false)
    private Integer id ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="SHOP_CODE", nullable=false, length=3)
    private String shopCode ; // Foreign Key     @Column(name="CUSTOMER_CODE", nullable=false, length=5)
    private String customerCode ; // Foreign Key     @Column(name="EMPLOYEE_CODE", nullable=false, length=4)
    private String employeeCode ; // Foreign Key     @Temporal(TemporalType.DATE)
    @Column(name="DATE")
    private Date date ;     @Column(name="STATE")
    private Integer state ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public BookOrder() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setId(Integer id) {
        this.id = id ;
    }
	public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : SHOP_CODE (VARCHAR) 
	public void setShopCode(String shopCode) {this.shopCode = shopCode;}
	public String getShopCode() {return this.shopCode;}

	//--- DATABASE MAPPING : CUSTOMER_CODE (VARCHAR) 
	public void setCustomerCode(String customerCode) {this.customerCode = customerCode;}
	public String getCustomerCode() {return this.customerCode;}

	//--- DATABASE MAPPING : EMPLOYEE_CODE (VARCHAR) 
	public void setEmployeeCode(String employeeCode) {this.employeeCode = employeeCode;}
	public String getEmployeeCode() {return this.employeeCode;}

	//--- DATABASE MAPPING : DATE (DATE) 
	public void setDate(Date date) {this.date = date;}
	public Date getDate() {return this.date;}

	//--- DATABASE MAPPING : STATE (INTEGER) 
	public void setState(Integer state) {this.state = state;}
	public Integer getState() {return this.state;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(id); 
		sb.append(shopCode); 
		sb.append("|"); 
		sb.append(customerCode); 
		sb.append("|"); 
		sb.append(employeeCode); 
		sb.append("|"); 
		sb.append(date); 
		sb.append("|"); 
		sb.append(state); 
        return sb.toString();
    }
}