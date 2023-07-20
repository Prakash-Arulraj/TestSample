package org.telugu;

import org.english.English;

//parent
public class Telugu extends English{
	
	public void teluguLanguage() {
		System.out.println("This is telugu lang");
	}
	
	public static void main(String[] args) {
		Telugu l = new Telugu();
		l.teluguLanguage();
		
		//parent class
		l.englishLanguage();
		
		//grant parent class
		l.tamilLanguage();
		
	}

}
