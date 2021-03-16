package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord ;
	private List<String> translations = new LinkedList<String>();
	
	
	public WordEnhanced(String alienWord, List<String> translations) {
		super();
		this.alienWord = alienWord;
		this.translations = translations;
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTranslation() {
		return translations;
	}

	public void setTranslation(List<String> translations) {
		this.translations = translations;
	}

	public boolean equals(String alienWord, List<String> list) {
		for(String parola : list) {
			if(parola.toLowerCase().equals(alienWord.toLowerCase()))
				return false;
			
			
		}
		return true;
	}

}
