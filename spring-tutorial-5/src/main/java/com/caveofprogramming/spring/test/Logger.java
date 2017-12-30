package com.caveofprogramming.spring.test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	
	@Autowired
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;
	
	
	/*
	@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	*/
	
	public void writeFile(String text) throws IOException {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
}
