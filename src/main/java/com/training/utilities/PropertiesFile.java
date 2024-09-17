package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileinput;

	public String getproperties(String key){
	
		String userDir= System.getProperty("user.dir");	
		String filesaperator= System.getProperty("file.separator");
		System.out.println(filesaperator);
				
		String filepath=userDir+filesaperator+"properties"+filesaperator+"application.properties";
		System.out.println(filepath);
		
		//load this filepath to object
		
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create the object of property
		Properties props = new Properties();
		try {
			props.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=props.getProperty(key);
		return value;

	}

}
