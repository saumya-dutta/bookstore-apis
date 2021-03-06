/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller.resource;

import org.springframework.hateoas.ResourceSupport;
import java.math.BigDecimal;

/**
 * Hateoas resource associated with BookOrderItem.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public class BookOrderItemResource extends ResourceSupport {

    private Integer bookOrderId;  
    private Integer bookId;  
    private Integer quantity;  
    private BigDecimal price;  

	// Constructor
	public BookOrderItemResource() {
		// Needed empty constructor for serialization
	}

	public Integer getBookOrderId() {
		return this.bookOrderId;
	}
	public void setBookOrderId(Integer bookOrderId) {
		this.bookOrderId = bookOrderId;
	}
	public Integer getBookId() {
		return this.bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return this.price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
