package org.all;

import org.telugu.Telugu;

//public class child class parent class
public class LanguageClass extends Telugu {
	
	private void prakash() {
		System.out.println("This is Prakash Branch");

	}
	
	public void allLanguage() {
		System.out.println("Major language is here");
	}
	
	public static void main(String[] args) {
		LanguageClass l = new LanguageClass();
		l.allLanguage();
		
		//parent class
		l.teluguLanguage();
		l.englishLanguage();
		l.tamilLanguage();
	}

}
