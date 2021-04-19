package com.tyss.log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.XMLLayout;

public class Test {
	public static void main(String[] args) {

		PropertyConfigurator.configure("logConfig.properties");
		Logger logger = Logger.getLogger(Test.class);
        
		logger.trace("tracing started");
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("tracing ended");
		
		
	}
}
