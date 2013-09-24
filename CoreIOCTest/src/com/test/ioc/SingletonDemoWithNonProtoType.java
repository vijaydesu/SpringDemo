package com.test.ioc;

public class SingletonDemoWithNonProtoType {

	protected PrototypeRef prototypeRef;

	protected String message;

	public PrototypeRef getPrototypeRef() {
		return prototypeRef;
	}

	public void setPrototypeRef(PrototypeRef prototypeRef) {
		this.prototypeRef = prototypeRef;
	}

	@Override
	public String toString() {
		return "PrototypeRef Class hashCode :" + this.hashCode()
				+ "\t Message :" + this.message + " \n" + prototypeRef;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
