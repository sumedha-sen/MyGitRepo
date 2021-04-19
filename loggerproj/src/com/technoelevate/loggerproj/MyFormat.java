package com.technoelevate.loggerproj;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormat extends Formatter {

	@Override
	public String format(LogRecord record) {

		return record.getThreadID() + " :: " + record.getSourceClassName() + " :: " + record.getSourceMethodName()
				+ " :: " + record.getMessage()+ " :: " + new Date(record.getMillis()) + "\n";
	}
	
	private void isLoggable() {
		// TODO Auto-generated method stub
		

	}

}
