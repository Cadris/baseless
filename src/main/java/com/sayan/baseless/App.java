package com.sayan.baseless;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sayan.baseless.USEAGE.Baseless;
import com.sayan.baseless.USEAGE.CRUD;
import com.sayan.baseless.test.Address;
import com.sayan.baseless.test.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        Baseless baseless = new Baseless();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Location:");
        String path = sc.nextLine();
        
        User user = new User("Tarun", "Dasgupta");
        Address address = new Address("India", "700008");
        //List<Class> list = new ArrayList<Class>();
        
        //list.add(User.class);
        
        baseless.setVaultLocation(path);
        try {
			baseless.setEntity(User.class);
			baseless.setEntity(Address.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        CRUD crud = new CRUD();
        crud.setBaseless(baseless);
        
        String out = crud.save(user);
        String out2 = crud.save(address);
        
        System.out.println("Created File: "+out);
        System.out.println("Created File: "+out2);
    }
}
