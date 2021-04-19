package com.technoelevate.loggerproj;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	final static Logger LOGGER=Logger.getLogger(LoggerTest.class.getName());
	
	public static void main(String[] args) {
		
		ConsoleHandler consolehandler=new ConsoleHandler();
		LOGGER.setLevel(Level.ALL);
		LOGGER.addHandler(consolehandler);
		//LOGGER.setLevel(Level.ALL);
		LOGGER.severe("severe msg");
		LOGGER.warning("warning msg");
		LOGGER.info("info msg");
		LOGGER.config("config msg");
		LOGGER.fine("fine msg");
		LOGGER.finer("finer msg");
		LOGGER.finest("finest msg");
		
		
		
		
	}
	

}
