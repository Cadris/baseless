package com.sayan.baseless.USEAGE;

import java.io.PrintWriter;

import com.sayan.baseless.DocumentDataCreators.JSONCreator;

public class CRUD {
	
	private Baseless baseless;
	
	
	
	/**
	 * @return the baseless
	 */
	public Baseless getBaseless() {
		return baseless;
	}



	/**
	 * @param baseless the baseless to set
	 */
	public void setBaseless(Baseless baseless) {
		this.baseless = baseless;
	}



	public <T extends ModelBasic> String save(T t) {
		System.out.println(t.getClass().getSimpleName()+" :: "+baseless.getEntityList().get(0).getSimpleName());
		
		boolean eFlag = false;
		for(Class c: this.baseless.getEntityList()) {
			if(t.getClass().getSimpleName().equals(c.getSimpleName())) {
				eFlag = true;
			}
		}
		if(eFlag) {
			String path = this.getBaseless().getVaultLocation()+"\\"+t.getClass().getSimpleName()+"\\"+t.getPk()+".json";
			try (PrintWriter out = new PrintWriter(path)) {
			    out.println(JSONCreator.createJSONString(t));
			    return path;
			} catch (Exception e) {
				System.out.println("Create Problem");
				e.printStackTrace();
			}
		} else {
			return "not save";
		}
		
		return null;
	}

}
