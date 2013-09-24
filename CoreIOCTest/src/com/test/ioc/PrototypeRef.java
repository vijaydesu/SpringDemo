/**
 * 
 */
package com.test.ioc;

/**
 * @author vdesu
 *
 */
public class PrototypeRef {
	
	public String pMessage;
	
	public void setpMessage(String pMessage) {
		this.pMessage = pMessage;
	}

	
	@Override
	public String toString()
	{
		return "PrototypeRef Class hashCode :"+this.hashCode()+"\t Message : "+this.pMessage;
	}

}
