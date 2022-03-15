/*
 * Created on 2022-03-14 ( Date ISO 2022-03-14 - Time 18:56:12 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
*/
package org.demo.controller.resource;

import org.springframework.hateoas.ResourceSupport;

/**
 * Hateoas resource associated with Shop.
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
public class ShopResource extends ResourceSupport {

    private String code;  
    private String name;  
    private String address1;  
    private String address2;  
    private Integer zipCode;  
    private String city;  
    private String countryCode;  
    private String phone;  
    private String email;  
    private String executive;  

	// Constructor
	public ShopResource() {
		// Needed empty constructor for serialization
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return this.address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return this.address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Integer getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExecutive() {
		return this.executive;
	}
	public void setExecutive(String executive) {
		this.executive = executive;
	}
}
