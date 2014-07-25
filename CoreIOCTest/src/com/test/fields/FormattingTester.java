/**
 * 
 */
package com.test.fields;

import java.math.BigDecimal;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 * @author vdesu
 *
 */
public class FormattingTester {
	
	//@NumberFormat(style = Style.NUMBER, pattern = "###-###-####")
	@NumberFormat(style = Style.CURRENCY)
	BigDecimal phoneNumber;

	public BigDecimal getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigDecimal phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
