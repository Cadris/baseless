package com.sayan.baseless.USEAGE;

import java.util.UUID;

public abstract class ModelBasic {
	
	private String pk = UUID.randomUUID().toString();

	/**
	 * @return the pk
	 */
	public String getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	public ModelBasic(String pk) {
		super();
		this.pk = pk;
	}

	public ModelBasic() {
		super();
	}
	
	

}
