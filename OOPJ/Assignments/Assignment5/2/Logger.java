package org.prgm2;


public class Logger{

	private String logMessages;
	
	private Logger() {
		this.logMessages = "";
	}
	
	private static Logger instance;
	
	public static Logger getinstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	
	public void log(String message) {
		logMessages = logMessages + message + "\n";
	}
	
	public String getlog() {
		return logMessages.toString();
	}
	
	public void clearlog() {
		logMessages = "";
	}

	

}
