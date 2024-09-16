package org.prgm2;

public class Program {

	public static void main(String[] args) {
		
		Logger l = Logger.getinstance();
		
		l.log("First Log...");
		l.log("Second Log...");
		l.log("Third Log...");
		
		
		System.out.println("Logging message:");
		System.out.println(l.getlog());
				
		l.clearlog();
		
		System.out.println("Log is clear now");
		System.out.println(l.getlog());
		
		}

}
