/**
 * 
 */
package com.test.ioc;

/**
 * @author vdesu
 *
 */
public abstract class SingletonDemo {
	
	protected abstract PrototypeRef createRef();
	
	protected String message;
	
	@Override
	public String toString()
	{
		return "PrototypeRef Class hashCode :"+this.hashCode()+"\t Message :"+this.message +" \n"+createRef();
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	

}
