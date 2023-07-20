package org.english;

import org.tamil.Tamil;

//parent
public class English extends Tamil {
	
	public void englishLanguage() {
		System.out.println("This is english lang");
	}
	
	public static void main(String[] args) {
		English l = new English();
		l.englishLanguage();
		
		//grand parent class
		l.tamilLanguage();
	}

}
