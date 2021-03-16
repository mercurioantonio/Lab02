package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AlienDictionary {
	
	private List<WordEnhanced> dictionary = new LinkedList<WordEnhanced>();
	
	
public AlienDictionary() {
		super();
		this.dictionary = dictionary;
	}



public void addWord (String alienWord, List<String> traslation) {
	boolean flag = true;
	for(WordEnhanced parola : dictionary) {
		if(parola.getAlienWord().toLowerCase().equals(alienWord.toLowerCase())) {
			flag = false;
			parola.getTranslation().addAll(traslation);
			}
		}
			
	
	
	if(flag == true) {
		dictionary.add(new WordEnhanced(alienWord, traslation));
	}
	
}

public String translateWord(String alienWord) {
	String word = "";
	for(WordEnhanced parola : dictionary) {
		if((parola.getAlienWord().toLowerCase()).equals(alienWord.toLowerCase())) {
			for(String pp : parola.getTranslation())
				word = word + " " + pp;
		}
			return word;
	}
	return null;
}


}
