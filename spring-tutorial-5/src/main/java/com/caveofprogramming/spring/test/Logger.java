package com.caveofprogramming.spring.test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
	//@Autowired
	private ConsoleWriter consoleWriter;
	
	//@Autowired
	private LogWriter fileWriter;
	
	
	/*
	@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	*/

	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) throws IOException {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if (consoleWriter != null)
		{
		consoleWriter.write(text);
		}
	}
	
	
}
