package com.sayan.baseless.IOManagement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FolderMapper {
	
	public static boolean isFolderPresent(String pathString) {
		
		File f = new File(pathString);
		if (f.exists() && f.isDirectory()) {
		   return true;
		} else {
			return false;
		}
		
	}
	
	public static void createFolder(String pathString) throws IOException {
		if(FolderMapper.isFolderPresent(pathString)) {
			System.out.println("Folder Already Exists.\nNot Doing anything.");
		} else {
			Files.createDirectories(Paths.get(pathString));
		}
	}

}