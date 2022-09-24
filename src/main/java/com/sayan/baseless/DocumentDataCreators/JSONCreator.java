package com.sayan.baseless.DocumentDataCreators;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONCreator {

	public static <T> String createJSONString(T t) {
		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		String json = "";
		
		try {
			json = mapper.writeValueAsString(t);
		} catch (StreamWriteException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			System.out.println("Invalid Object Sent");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return json;
	}
	
	public static <T> String[] createJSONString(List<T> t) {
		String arr[] = new String[t.size()];
		int i=0;
		for(T tElement: t) {
			arr[i] = JSONCreator.createJSONString(tElement); 
			i++;
		}
		return arr;
	}

	
}
