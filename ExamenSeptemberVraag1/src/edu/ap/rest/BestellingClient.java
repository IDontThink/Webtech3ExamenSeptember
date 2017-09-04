package edu.ap.rest;

import org.restlet.resource.ClientResource;;

public class BestellingClient {
	
public static void main(String[] args) {
        
        try {
       	ClientResource resource = new ClientResource("http://localhost:8182/bestellingen/bestelling");
       	// Post a new race
       	String bestelling1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
       	bestelling1 += "<bestelling id=\"1\" name=\"Patje Boemans\" adres=\"Lindenlaan 199\" date=\"25/09/2017\" productnaam=\"Aardappelschiller\" hoeveelheid=\"420\"></bestelling>";
   		resource.post(bestelling1);
   		// get the response
       	System.out.println(resource.getResponseEntity().getText());
       	
       	String bestelling2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
       	bestelling2 += "<bestelling id=\"2\" name=\"Tom Elslander\" adres=\"Fabriekstraat 104\" date=\"18/10/2017\" productnaam=\"Nvidea Geforce GTX 1060\" hoeveelheid=\"1\"></bestelling>";
   		resource.post(bestelling2);
   		// get the response
   		// get the response
       	System.out.println(resource.getResponseEntity().getText());
       }
       catch (Exception e) {
           System.out.println("In main : " + e.getMessage());
       }

	}
}
