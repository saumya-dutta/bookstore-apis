/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * Persistent class for BookOrderItem entity stored in table BOOK_ORDER_ITEM.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Entity
@Table(name="BOOK_ORDER_ITEM", schema="ROOT" )
public class BookOrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private BookOrderItemKey compositePrimaryKey ;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="QUANTITY", nullable=false)
    private Integer quantity ;     @Column(name="PRICE", nullable=false)
    private BigDecimal price ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public BookOrderItem() {
		super();
		this.compositePrimaryKey = new BookOrderItemKey();       
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setBookOrderId(Integer bookOrderId) {
        this.compositePrimaryKey.setBookOrderId(bookOrderId) ;
    }
	public Integer getBookOrderId() {
        return this.compositePrimaryKey.getBookOrderId() ;
    }
	public void setBookId(Integer bookId) {
        this.compositePrimaryKey.setBookId(bookId) ;
    }
	public Integer getBookId() {
        return this.compositePrimaryKey.getBookId() ;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : QUANTITY (INTEGER) 
	public void setQuantity(Integer quantity) {this.quantity = quantity;}
	public Integer getQuantity() {return this.quantity;}

	//--- DATABASE MAPPING : PRICE (DECIMAL) 
	public void setPrice(BigDecimal price) {this.price = price;}
	public BigDecimal getPrice() {return this.price;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("[" + compositePrimaryKey + "]"); 
		sb.append(quantity); 
		sb.append("|"); 
		sb.append(price); 
        return sb.toString();
    }
}