package com.sayan.baseless.USEAGE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sayan.baseless.IOManagement.FolderMapper;

public abstract class CONFIGURATION {

	private String vaultLocation="%TEMP%";
	
	private List<Class> entityList = new ArrayList<Class>();

	/**
	 * @return the vaultLocation
	 */
	public String getVaultLocation() {
		return vaultLocation;
	}

	/**
	 * @param vaultLocation the vaultLocation to set
	 */
	public void setVaultLocation(String vaultLocation) {
		this.vaultLocation = vaultLocation;
	}

	/**
	 * @return the entityList
	 */
	public List<Class> getEntityList() {
		return entityList;
	}

	/**
	 * @param entityList the entityList to set
	 */
	public void setEntityList(List<Class> entityList) {
		this.entityList = entityList;
	}
	
	// Main Portion
	
	public void setEntity(Class paramClass) throws IOException {
		String masterPath = this.vaultLocation+"\\"+paramClass.getSimpleName();
		System.out.println(masterPath);
		FolderMapper.createFolder(masterPath);
		this.entityList.add(paramClass);
	}
	
	public void loadEntities() throws IOException {
		for(Class c:this.entityList) {
			setEntity(c);
		}
	}
}
