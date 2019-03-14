package com.framework.log4jdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Sample test class for log4j demo
 */
public class TestClass 
{
	public static Logger LOG = Logger.getLogger(TestClass.class);

	public static void main(String[] args) 
	{
		
	//PropertiesConfigurator is used to configure logger from properties file

        PropertyConfigurator.configure("src/main/java/resources/log4j.properties");
        
		LOG.info("Info message.");
		LOG.warn("Warn messgae.");
		LOG.error("Error message.");
	}
}
