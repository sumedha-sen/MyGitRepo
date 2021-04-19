package com.tyss.log4J;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BasicConfigurator.configure();
    	
    	Logger logger=Logger.getLogger(App.class);
    	logger.setLevel(Level.ALL);
    	FileAppender fileAppender=new FileAppender(new HTMLLayout(),"logs.log");
    	logger.addAppender(fileAppender);
    	logger.trace("tracing started");
    	logger.fatal("fatal msg");
    	logger.warn("fatal msg");
    	logger.info("fatal msg");
    	logger.debug("fatal msg");
    	logger.error("fatal msg");
    	logger.trace("tracing ended");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
