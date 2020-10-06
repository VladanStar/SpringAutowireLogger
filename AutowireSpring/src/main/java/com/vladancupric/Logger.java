package com.vladancupric;

public class Logger {
	
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public Logger() {
		
	}
	
	public Logger(LogWriter consoleWriter, LogWriter fileWriter) {
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	public void writeFile(String text){
		fileWriter.write(text);
	}
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
	
	

}
