package com.sayan.baseless.test;

import com.sayan.baseless.USEAGE.ModelBasic;

public class User extends ModelBasic{

	private String name;
	private String classNo;
	public User(String name, String classNo) {
		this.name = name;
		this.classNo = classNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the classNo
	 */
	public String getClassNo() {
		return classNo;
	}
	/**
	 * @param classNo the classNo to set
	 */
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", classNo=" + classNo + "]";
	}
	
}
