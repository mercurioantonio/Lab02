package it.polito.tdp.alien;

import java.util.List;

public class Word {
	
	private String alienWord ;
	private String translation ;
	
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public boolean equals(String alienWord, List<String> list) {
		for(String parola : list) {
			if(parola.toLowerCase().equals(alienWord.toLowerCase()))
				return false;
			
			
		}
		return true;
	}
}
