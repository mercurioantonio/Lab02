package it.polito.tdp.alien;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	AlienDictionary dizionario = new AlienDictionary();

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtParola;

	@FXML
	private TextArea txtResult;

	@FXML
	void doReset(ActionEvent event) {

	}

	@FXML
    void doTranslete(ActionEvent event) {
		
    	String componente = txtParola.getText();
    	List translations = new LinkedList<String>() ;
    	boolean f = true;
    	
    	if(componente != "") {
    	for (int i=0; i<componente.length(); i++) {
    	      char ch = componente.charAt(i);
    	        if (ch > '0' && ch < '9') {
    	        	f = false;
    	        }
    	}
    	if(f == true) {           
    	if(componente.contains(" ")) {
    		int c = componente.indexOf(" ");
    		String alien = componente.substring(0, c);
    		String traslation = componente.substring(c+1, componente.length());
    		
    		translations.add(traslation);
    	
    		dizionario.addWord(alien, translations);
    		
    		txtParola.clear();
    		
    	}
    	else {
    		txtResult.setText(componente + " --> " + dizionario.translateWord(componente));
    		txtParola.clear();
    	}
    	}
    	
    	else {
    		txtResult.setText("Inserire una parola valida"); 
    	    txtParola.clear();
    	}
    	}
    	
    	else {
    		txtResult.setText("Parola non inserita");  
    		txtParola.clear();
    	}
    	
    	

    }

	@FXML
	void initialize() {
		assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

	}
}
