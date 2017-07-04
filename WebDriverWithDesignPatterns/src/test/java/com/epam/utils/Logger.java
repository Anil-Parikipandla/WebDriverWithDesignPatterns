package com.epam.utils;

import org.apache.logging.log4j.LogManager;

public class Logger {
	
	public static org.apache.logging.log4j.Logger printLogAs(){
		return LogManager.getRootLogger();
	}
	
}
