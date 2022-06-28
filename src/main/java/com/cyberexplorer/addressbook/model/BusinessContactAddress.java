package com.cyberexplorer.addressbook.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
@DiscriminatorValue("BUSINESS")
public class BusinessContactAddress extends ContactAddress {
	private static final long serialVersionUID = 1L;
	protected String website;
	
	public BusinessContactAddress(String name, String phoneNumber, String email, String addressType, boolean defaultAddress, String website) {
		super(name, phoneNumber, email, addressType, defaultAddress);
		this.website = website;
	}

	@Override
	public String show() {
		
		return toString();
	}
	
	@Override
	public String toString() {
		return getName() + "," + getPhoneNumber() + "," + getEmailAddress() + "," + getAddressType() + "," + isDefaultAddress() + "," + getWebsite();
	}
}
