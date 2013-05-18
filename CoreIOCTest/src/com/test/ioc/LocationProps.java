/**
 * 
 */
package com.test.ioc;

/**
 * @author Admin
 *
 */
public class LocationProps {

	private String city;
	private Integer zipcode;
	private String country;
	private String state;
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zipcode
	 */
	public Integer getZipcode() {
		Integer val=new Integer("10");
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString(){
		return ("Location Details :"
				+"\n\t CITY : "+this.city
				+"\n\t COUNTRY : "+this.country
				+"\n\t STATE : "+this.state
				+"\n\t ZIP CODE : "+this.zipcode
				);
	}
	
}
